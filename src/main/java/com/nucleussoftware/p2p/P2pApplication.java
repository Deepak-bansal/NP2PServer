package com.nucleussoftware.p2p;

import com.nucleussoftware.p2p.domain.User;
import com.nucleussoftware.p2p.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class P2pApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(P2pApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.save(new User("Deepak", "Bansal", "user1@gmail.com", "pass"));
        userRepository.save(new User("Tarun", "Kumar", "user2@gmail.com", "pass2"));
    }

/*
    public void addDefaultData(ConfigurableApplicationContext context){

	}*/
}
