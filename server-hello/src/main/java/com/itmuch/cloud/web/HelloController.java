package com.itmuch.cloud.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>类名: HelloController</pre>
 * <pre>描述: </pre>
 * <pre>版权: 税友软件集团股份有限公司</pre>
 * <pre>日期: 2017/11/16  19:42</pre>
 * <pre>作者: ljianf</pre>
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;//服务发现，eureka客户端

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helle(){
        ServiceInstance localServices = discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:"+localServices.getHost()+"service_id:"+localServices.getServiceId());
        return "hello";
    }
}
