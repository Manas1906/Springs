package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
//	ClassPathResource resource = new ClassPathResource("springdemo/NewFile.xml");
//	BeanFactory  beanFactory = new XmlBeanFactory(resource);
//	Car car = (Car) beanFactory.getBean("car");
//	System.out.println(car);
//Bike bike=(Bike) beanFactory.getBean("bike");
//System.out.println(bike);

		ApplicationContext context = new ClassPathXmlApplicationContext("springdemo/NewFile.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car);
		Bike bike = (Bike) context.getBean("bike");
		System.out.println(bike);

	}
}