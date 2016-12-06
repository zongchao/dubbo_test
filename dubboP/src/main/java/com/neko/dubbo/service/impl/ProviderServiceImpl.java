package com.neko.dubbo.service.impl;

import com.neko.dubbo.facade.service.ProviderService;
import org.springframework.stereotype.Component;


/**
 * Created with IntelliJ IDEA.
 * User: zc
 * Date: 2016/12/4
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
@Component("providerService")
public class ProviderServiceImpl implements ProviderService {

    @Override
    public void sayHello(String s) {
        System.out.println("hello" + s);
    }
}
