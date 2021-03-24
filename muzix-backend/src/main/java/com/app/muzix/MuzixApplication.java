package com.app.muzix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class MuzixApplication {

  public static void main(String[] args) {
    SpringApplication.run(MuzixApplication.class, args);
  }

}
