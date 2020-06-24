package com.lzc.kingisglory;

import com.lzc.kingisglory.user.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(UserController.class)
public class KingisgloryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KingisgloryApplication.class, args);
    }

}
