package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.Car;
import in.ashokit.beans.Engine;

@SpringBootApplication
public class SpringBeans04ApplicationIoc1Application {

	public static void main(String[] args) {
     ConfigurableApplicationContext ct =SpringApplication.run(SpringBeans04ApplicationIoc1Application.class, args);
		Car c1 =ct.getBean(Car.class);  
		c1.drive();
	}

}
