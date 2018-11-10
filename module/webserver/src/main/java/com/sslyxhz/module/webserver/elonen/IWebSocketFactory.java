package com.sslyxhz.module.webserver.elonen;

import com.sslyxhz.module.webserver.elonen.NanoHTTPD.IHTTPSession;

public interface IWebSocketFactory {
    WebSocket openWebSocket(IHTTPSession handshake);
}
