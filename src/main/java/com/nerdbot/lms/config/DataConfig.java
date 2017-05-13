package com.nerdbot.lms.config;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class DataConfig {
	
	@Autowired
	Environment env;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		Resource config = new ClassPathResource("hibernate.cfg.xml");
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setConfigLocation(config);
		sessionFactory.setPackagesToScan(env.getProperty("nerdbot.lms.entity.pkg"));
		sessionFactory.setDataSource(dataSource());
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("nerdbot.lms.db.driver"));
		
		dataSource.setUrl(env.getProperty("nerdbot.lms.db.url"));
		
		dataSource.setUsername(env.getProperty("nerdbot.lms.db.username"));
		
		dataSource.setPassword(env.getProperty("nerdbot.lms.db.password"));
		
		return dataSource;
	}

}
