package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("in.nit.controller")
public class SpringBootWithDbConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithDbConnectionApplication.class, args);
	}

}
