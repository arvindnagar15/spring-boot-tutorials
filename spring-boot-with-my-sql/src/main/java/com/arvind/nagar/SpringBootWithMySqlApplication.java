package com.arvind.nagar;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.arvind.nagar.dao.EmployeeRepository;

@SpringBootApplication
@EnableJpaRepositories("com.arvind.nagar.dao")
@EntityScan("com.arvind.nagar.model")
public class SpringBootWithMySqlApplication implements CommandLineRunner{

	@Autowired
    DataSource dataSource;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("Our DataSource is = " + dataSource);
	        Iterable<com.arvind.nagar.model.Employee> systemlist = employeeRepository.findAll();
	        for(com.arvind.nagar.model.Employee systemmodel:systemlist){
	            System.out.println("Here is a system: " + systemmodel.toString());
	        }
		
	}
}
