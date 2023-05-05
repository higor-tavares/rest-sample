package org.example.service;

import java.time.LocalDateTime;
import java.util.Objects;
import org.example.domain.HelloObject;
import org.example.domain.MyCustomException;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
  public String find(String id) {
    if(Objects.equals(id, "1")) return "admin";
    throw new MyCustomException();
  }
  public HelloObject get() {
    return new HelloObject(2, "This is a message", LocalDateTime.now());
  }
}
