package com.demo.test;

import com.demo.rpc.api.HelloService;
import com.demo.rpc.registry.DefaultServiceRegistry;
import com.demo.rpc.registry.ServiceRegistry;
import com.demo.rpc.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 */
public class SocketTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        SocketServer socketServer = new SocketServer(serviceRegistry);
        socketServer.start(9000);
    }

}
