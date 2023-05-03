package org.example.controller;

import com.google.common.base.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/**
 * Usually, the controller is the last in the chain of dependencies.
 * It receives HTTP requests from the Spring front controller (the DispatcherServlet)
 * and simply delegates them forward to a service layer.
 * If there’s no use case where the controller has to be injected or manipulated
 * through a direct reference, then I prefer not to declare it as public.
 */
@RestController
@RequestMapping("/hello")
class HelloController {

  @GetMapping
  @ResponseStatus(HttpStatus.CREATED)
  public String sayHello() {
    return "Hello world from Spring Boot!";
  }
  @GetMapping("/{name}")
  @ResponseStatus(HttpStatus.CREATED)
  public String sayHelloToName(@PathVariable("name") String name) {
    Preconditions.checkArgument(name.length()>3);
    return String.format("Hello %s!",name);
  }
}
