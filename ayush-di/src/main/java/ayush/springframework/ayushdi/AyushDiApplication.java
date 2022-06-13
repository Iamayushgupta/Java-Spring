package ayush.springframework.ayushdi;

import ayush.springframework.ayushdi.controllers.ConstructorInjectedController;
import ayush.springframework.ayushdi.controllers.MyController;
import ayush.springframework.ayushdi.controllers.PropertyInjectedController;
import ayush.springframework.ayushdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class AyushDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(AyushDiApplication.class, args);
		MyController myController =(MyController) ctx.getBean("myController");
		System.out.println("--primary bean -----");
		System.out.println(myController.getGreeting());

		System.out.println("--------property--------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----setter-----");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----constructor------");
		ConstructorInjectedController constructorInjectedController =(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}
}
