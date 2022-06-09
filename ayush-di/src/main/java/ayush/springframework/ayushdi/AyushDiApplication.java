package ayush.springframework.ayushdi;

import ayush.springframework.ayushdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class AyushDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(AyushDiApplication.class, args);
		MyController myController =(MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
