package com.hwj.tgy.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@ServerEndpoint(value = "/ws/websocket/tgy/{openid}")
@Component
public class WebSocketMiniProgramServer {

    @PostConstruct
    public void init() {
        System.out.println("websocket 加载");
    }

    private static Logger log = LoggerFactory.getLogger(WebSocketMiniProgramServer.class);
    private static final AtomicInteger OnlineCount = new AtomicInteger(0);
    private static Map<String,Session> concurrentHashMap=new ConcurrentHashMap<String,Session>();
    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session,@PathParam(value="openid") String openId) {
        concurrentHashMap.put(openId,session);
        int cnt = OnlineCount.incrementAndGet(); // 在线数加1
        log.info("有连接加入，当前连接数为：{} openId:"+openId, cnt);
        SendMessage(session, "连接成功");
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(Session session,@PathParam("openid")String openId) {
        concurrentHashMap.remove(openId);
        int cnt = OnlineCount.decrementAndGet();
        log.info("有连接关闭，当前连接数为：{}", cnt);
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message
     *            客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("来自客户端的消息：{}",message);
        SendMessage(session, "收到消息，消息内容："+message);

    }

    /**
     * 出现错误
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发生错误：{}，Session ID： {}",error.getMessage(),session.getId());
        error.printStackTrace();
    }

    /**
     * 发送消息，实践表明，每次浏览器刷新，session会发生变化。
     * @param session
     * @param message
     */
    public static void SendMessage(Session session, String message) {
        try {
//            session.getBasicRemote().sendText(String.format("%s (From Server，Session ID=%s)",message,session.getId()));
            session.getBasicRemote().sendText(message);
        } catch (IOException e) {
            log.error("发送消息出错：{}", e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 群发消息
     * @param message
     * @throws IOException
     */
    public static void BroadCastInfo(String message) throws IOException {
        for (String openId : concurrentHashMap.keySet()) {
            Session session = concurrentHashMap.get(openId);
            if(session.isOpen()){
                SendMessage(session, message);
            }
        }
    }

    /**
     * 指定Session发送消息
     * @param openId
     * @param message
     * @throws IOException
     */
    public static void SendMessage(String message,String openId) throws IOException {
        Session session = null;
        for (String openIdLocal : concurrentHashMap.keySet()) {
            if(openId.equals(openIdLocal)){
                session = concurrentHashMap.get(openId);
                break;
            }
        }
        if(session!=null){
            SendMessage(session, message);
        }
        else{
            log.warn("没有找到你指定ID的会话：{}",openId);
        }
    }
}
