package com.sapient;

import org.aspectj.util.Reflection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.support.TransactionTemplate;

@SpringBootApplication
@EnableJpaAuditing
public class SpringSessionApplication {



    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringSessionApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }
}
