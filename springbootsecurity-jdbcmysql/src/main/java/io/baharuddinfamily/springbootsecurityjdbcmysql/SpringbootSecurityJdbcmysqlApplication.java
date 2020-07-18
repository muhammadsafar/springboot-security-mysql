package io.baharuddinfamily.springbootsecurityjdbcmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.baharuddinfamily.springbootsecurityjdbcmysql.model.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringbootSecurityJdbcmysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityJdbcmysqlApplication.class, args);
	}

}
