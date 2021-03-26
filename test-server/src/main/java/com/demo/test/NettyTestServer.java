package com.demo.test;

import com.demo.rpc.api.HelloService;
import com.demo.rpc.netty.server.NettyServer;
import com.demo.rpc.registry.DefaultServiceRegistry;
import com.demo.rpc.registry.ServiceRegistry;

/**
 * 测试用Netty服务提供者（服务端）
 */
public class NettyTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry registry = new DefaultServiceRegistry();
        registry.register(helloService);
        NettyServer server = new NettyServer();
        server.start(9999);
    }

}
