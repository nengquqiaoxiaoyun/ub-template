package cn.ubaudio.ubmanageserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ubaudio.ubmanageserver.mapper")
public class UbManageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbManageServerApplication.class, args);
    }

}
