package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		String a="a";
		a="a";
		a="a";
		String b="a";
		b="a";
		b="a";
		a=b;
		return "<h1>Hello World</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
