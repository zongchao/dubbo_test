package com.neko.dubbo.customer.service.impl;

import com.neko.dubbo.customer.service.CustomerService;
import com.neko.dubbo.facade.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: zc
 * Date: 2016/12/4
 * Time: 18:44
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    ProviderService providerService;

    @Override
    public void say(String s) {
        providerService.sayHello(s);
    }
}
