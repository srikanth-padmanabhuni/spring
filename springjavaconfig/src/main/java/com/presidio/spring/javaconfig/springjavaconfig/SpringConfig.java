package com.presidio.spring.javaconfig.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(Dao.class)
public class SpringConfig {

	@Bean(initMethod = "initLifeCycleMethod", destroyMethod = "destroyLifeCycleMethod")
	@Scope(scopeName = "prototype") // singleton or request or session
	public Service service() {
		return (new Service());
	}
	
}
