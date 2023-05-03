package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This single annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan.
 * By default, it will scan all the components in the same package or below.
 * The @EnableWebMvc annotation provides the Spring Web MVC configuration
 * such as setting up the dispatcher servlet, enabling the @Controller and the @RequestMapping annotations and setting up other defaults.
 */
@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    //ApplicationEntryPoint this serve a tomcat container running on port 8080 by default
    SpringApplication.run(Main.class, args);
  }
}