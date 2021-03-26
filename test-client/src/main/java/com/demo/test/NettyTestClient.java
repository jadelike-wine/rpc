package com.demo.test;

import com.demo.rpc.RpcClient;
import com.demo.rpc.RpcClientProxy;
import com.demo.rpc.api.HelloObject;
import com.demo.rpc.api.HelloService;
import com.demo.rpc.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient("127.0.0.1", 9999);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);

    }

}
