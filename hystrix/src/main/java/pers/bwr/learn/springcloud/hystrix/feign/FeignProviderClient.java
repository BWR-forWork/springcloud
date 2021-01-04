package pers.bwr.learn.springcloud.hystrix.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pers.bwr.learn.springcloud.hystrix.entity.Student;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
