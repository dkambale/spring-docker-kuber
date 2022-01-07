package com.codingworld.springdcokerkuber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

  @GetMapping(value = "/hello")
  public String sayHello() {
    return "Hello From springboot docker project";
  }

  public String start(){
    return "Started service";
  }
}
