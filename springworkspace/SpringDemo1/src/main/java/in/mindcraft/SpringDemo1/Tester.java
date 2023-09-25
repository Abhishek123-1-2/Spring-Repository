package in.mindcraft.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MobilePhone m1 = (MobilePhone) context.getBean("mobilePhone");
		m1.display();
	}

}
