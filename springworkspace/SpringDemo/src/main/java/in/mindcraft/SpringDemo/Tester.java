package in.mindcraft.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DebitCard dc = (DebitCard)context.getBean("dcard");
		dc.details();
		
		System.out.println(dc.adress.name);
		System.out.println(dc.adress.city);
	}

}
