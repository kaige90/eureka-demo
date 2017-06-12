# spring-cloud example

## 项目说明
 项目用来演示spring cloud的服务的注册以及使用,通过eureka作为注册中心,通过robin作为客户端的负载均衡,fegin用来作为远程调用客户端来使用.

## 启动顺序
1. 先启动discovery模块;
2. 启动service0,service1模块;
3. 启动consumer0,consumer1模块;
