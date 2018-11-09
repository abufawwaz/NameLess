CMAKE_MINIMUM_REQUIRED(VERSION 3.5)
PROJECT(Jpp)

SET(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

#ARCHS集合
SET(ARCHS "arm" "arm64" "x86" "x86_64" "mips" "mips64")

#PLATFORM集合
SET(PLATFORM "arm-linux-androideabi" "aarch64-linux-android" "i686-linux-android" "x86_64-linux-android" "mipsel-linux-android" "mips64el-linux-android")


SET(JSONCPP_INCLUDE_DIR include)

INCLUDE_DIRECTORIES(${JSONCPP_INCLUDE_DIR})

SET(PUBLIC_HEADERS
    ${JSONCPP_INCLUDE_DIR}/json/config.h
    ${JSONCPP_INCLUDE_DIR}/json/forwards.h
    ${JSONCPP_INCLUDE_DIR}/json/features.h
    ${JSONCPP_INCLUDE_DIR}/json/value.h
    ${JSONCPP_INCLUDE_DIR}/json/reader.h
    ${JSONCPP_INCLUDE_DIR}/json/writer.h
    ${JSONCPP_INCLUDE_DIR}/json/assertions.h
    ${JSONCPP_INCLUDE_DIR}/json/version.h
    )

SOURCE_GROUP("Public API" FILES ${PUBLIC_HEADERS})

SET(jsoncpp_sources
                src/json_tool.h
                src/json_reader.cpp
                src/json_valueiterator.inl
                src/json_value.cpp
                src/json_writer.cpp
                src/version.h.in)

#INDEX=0 "arm" 
#INDEX=1 "arm64"
#INDEX=2 "x86"
#INDEX=3 "x86_64"
#INDEX=4 "mips"
#INDEX=5 "mips64"

SET(INDEX 0)

list(GET ARCHS ${INDEX} TARGET_ARCH)
list(GET PLATFORM ${INDEX} TARGET_PLATFORM)

MESSAGE("ARCH= " ${TARGET_ARCH})
MESSAGE("PLATFORM= " ${TARGET_PLATFORM})

SET(CMAKE_C_COMPILER "$ENV{HOME}/android-toolchain/${TARGET_ARCH}/bin/${TARGET_PLATFORM}-gcc")
SET(CMAKE_CXX_COMPILER "$ENV{HOME}/android-toolchain/${TARGET_ARCH}/bin/${TARGET_PLATFORM}-g++")


SET(EXECUTABLE_OUTPUT_PATH ${PROJECT_BINARY_DIR}/bin)
SET(LIBRARY_OUTPUT_PATH ${PROJECT_BINARY_DIR}/lib)

ADD_LIBRARY(${TARGET_ARCH}_share SHARED ${PUBLIC_HEADERS} ${jsoncpp_sources})
SET_TARGET_PROPERTIES(${TARGET_ARCH}_share PROPERTIES OUTPUT_NAME ${TARGET_ARCH})
ADD_LIBRARY(${TARGET_ARCH}_static STATIC ${PUBLIC_HEADERS} ${jsoncpp_sources})
SET_TARGET_PROPERTIES(${TARGET_ARCH}_static PROPERTIES OUTPUT_NAME ${TARGET_ARCH})
