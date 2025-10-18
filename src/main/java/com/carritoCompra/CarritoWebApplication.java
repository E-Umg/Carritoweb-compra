package com.carritoCompra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CarritoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarritoWebApplication.class, args);
	}

}
