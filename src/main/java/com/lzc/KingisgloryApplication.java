package com.lzc;

import com.lzc.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@MapperScan("com.lzc.dao.mapper")
//@Import(UserController.class)
public class KingisgloryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KingisgloryApplication.class, args);
    }

}
