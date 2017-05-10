package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableJpaRepositories
@ComponentScan("com.qf")
@MapperScan("com.qf.timesheet.dao.batis")
public class TimesheetApp extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(TimesheetApp.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(TimesheetApp.class);
    }
}
// @EnableWebMvc 可自定义控制WebMVC   参考WebMvcAutoConfiguration
