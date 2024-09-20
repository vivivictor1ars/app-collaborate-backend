package backend.project;

import backend.project.entities.Brand;
import backend.project.entities.Car;
import backend.project.entities.Model;
import backend.project.repositories.BrandRepository;
import backend.project.repositories.CarRepository;
import backend.project.repositories.ModelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("backend.project.repositories")
@EntityScan("backend.project.entities")
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
}
