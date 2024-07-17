package br.com.douglasbello.cache_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class CacheSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheSampleApplication.class, args);
	}

}
