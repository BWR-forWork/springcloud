package pers.bwr.learn.springcloud.feign.feign.impl;

import org.springframework.stereotype.Component;
import pers.bwr.learn.springcloud.feign.entity.Student;
import pers.bwr.learn.springcloud.feign.feign.FeignProviderClient;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中……";
    }
}
