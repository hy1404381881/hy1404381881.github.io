- hessian是一种高效简洁的远程调用框架，它采用的是二进制RPC协议（Binary），具有轻量、传输量小、平台无关的特点，特别适合于目前网络带宽比较小的手机网络应用项目。
- 类似于WebService，不过不使用SOAP协议，而是用Binary RPC协议，相比webservice而言更简单、快捷。
- 它把协议报文封装到http封包中，通过HTTP信道传输。Hessian是通过servlet提供远程服务，完全使用动态代理来实现的,推荐采用面向接口编程，因此，Hessian服务建议通过接口暴露。

[Hessian知识学习总结（一）——基础知识](http://blog.csdn.net/wodediqizhang/article/details/51603512)

[Hessian知识学习总结（二）——Hessian的helloworld](http://blog.csdn.net/wodediqizhang/article/details/51605441)

[Hessian知识学习总结（三）——Spring + Hessian + Spring MVC](http://blog.csdn.net/wodediqizhang/article/details/51723821)

