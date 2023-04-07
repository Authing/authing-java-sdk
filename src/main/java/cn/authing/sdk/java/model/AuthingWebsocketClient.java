package cn.authing.sdk.java.model;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.Map;

/**
 * @author songxueyan
 * @date 2023/2/21
 **/
public class AuthingWebsocketClient extends WebSocketClient {

    private final Receiver receiver;

    public AuthingWebsocketClient(URI serverUri, Map<String, String> httpHeaders, Receiver receiver) {
        super(serverUri, httpHeaders);
        this.receiver = receiver;
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("onOpen");
    }

    @Override
    public void onMessage(String s) {
        // System.out.println("onMessage:"+s);
        this.receiver.onReceiverMessage(s);
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        System.out.println("onClose,i="+i+",s="+s+",b="+b);
    }

    @Override
    public void onError(Exception e) {
        System.out.println(e);
    }
}
