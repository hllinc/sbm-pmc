package com.hllinc.sbmpmc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.hllinc.sbmpmc.mapper"})
public class SbmPmcApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbmPmcApplication.class, args);
	}
}
