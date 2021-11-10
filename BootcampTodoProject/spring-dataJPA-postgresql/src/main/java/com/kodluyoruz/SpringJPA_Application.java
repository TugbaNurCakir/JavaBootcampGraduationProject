package com.kodluyoruz;

import com.kodluyoruz.Repository.UserRepository;
import com.kodluyoruz.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SpringBootApplication
public class SpringJPA_Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringJPA_Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
