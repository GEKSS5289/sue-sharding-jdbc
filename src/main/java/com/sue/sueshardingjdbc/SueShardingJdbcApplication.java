package com.sue.sueshardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.sue.mapper")

public class SueShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SueShardingJdbcApplication.class, args);
    }

}
