package umc.umc7th_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Umc7thSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Umc7thSpringApplication.class, args);
	}

}
