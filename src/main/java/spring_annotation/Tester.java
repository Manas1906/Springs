package spring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
public static void main(String[] args) {
//	ApplicationContext context=new ClassPathXmlApplicationContext("spring_annotation/Helper.xml");
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	Mobile mobile=(Mobile) context.getBean("mobile");
	System.out.println(mobile);
	Airtel airtel=(Airtel) context.getBean("airtel");
	System.out.println(airtel);
	Jio jio=(Jio) context.getBean("jio");
	System.out.println(jio);
}
}
