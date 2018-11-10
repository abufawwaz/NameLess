package com.sslyxhz.module.webserver;

import java.io.IOException;

import com.sslyxhz.module.webserver.elonen.NanoHTTPD;
import com.sslyxhz.module.webserver.elonen.WebSocket;
import com.sslyxhz.module.webserver.elonen.WebSocketFrame;

/**
 * Created by BlackWolf on 22/02/15.
 */
public abstract class CWWebSocket extends WebSocket {

    private boolean isIdentified = false;
    private boolean isLocal = false;

    public CWWebSocket(NanoHTTPD.IHTTPSession handshakeRequest) {
        super(handshakeRequest);
    }

    @Override
    protected void onPong(WebSocketFrame pongFrame) {
    }

    @Override
    protected void onException(IOException e) {
        //This might actually be normal, for example an EOFException is thrown when the socket is closed
    }

    @Override
    protected abstract void onMessage(WebSocketFrame messageFrame);

    @Override
    protected abstract void onClose(WebSocketFrame.CloseCode code, String reason, boolean initiatedByRemote);
}
