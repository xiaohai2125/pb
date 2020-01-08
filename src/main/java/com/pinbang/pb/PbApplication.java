package com.pinbang.pb;


import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.Resource;


@MapperScan(basePackages = {"com.pinbang.pb.mapper"})
@ServletComponentScan(basePackages = "com.pinbang.pb.*")
@EnableScheduling
@EnableAutoConfiguration
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class PbApplication {


	public static void main(String[] args) {

		SpringApplication.run(PbApplication.class, args);

	}

}
