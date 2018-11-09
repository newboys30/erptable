package com.bioFish.ERPTables;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.bioFish.ERPTables.dao.mapper")
public class ErpTablesApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ErpTablesApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ErpTablesApplication.class, args);
	}
}
