package br.com.matheusponte.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // anotation, classe gerenciada
@ComponentScan(basePackages = "br.com.matheusponte")
public class ProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringbootApplication.class, args);
	}

}
