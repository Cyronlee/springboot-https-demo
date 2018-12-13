# springboot-https-demo
Springboot开启HTTPS并配置HTTP自动跳转HTTPS
直接运行后访问http(s)://localhost即可

# 更换证书示例（万网Tomcat）
1. 到万网下载HTTPS证书
2. pfx文件放入resource文件夹，并如下配置即可
```
server:
  port: 443
  ssl:
    key-store: classpath:11234123_xxx.xxx.com.pfx
    enabled: true
    key-store-password: 12z123G1
    key-store-type: PKCS12
```
