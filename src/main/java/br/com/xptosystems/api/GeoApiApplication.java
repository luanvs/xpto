package br.com.xptosystems.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class GeoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoApiApplication.class, args);
	}
}
