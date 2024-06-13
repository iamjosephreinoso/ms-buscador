package net.unir.grupo_12.buscador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "net.unir.grupo_12.buscador.repository")
@EntityScan(basePackages = "net.unir.grupo_12.buscador.entity")
public class MsBuscadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBuscadorApplication.class, args);
	}

}
