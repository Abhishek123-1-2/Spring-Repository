package in.mindcraft.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
LAPTOP l1 = (LAPTOP) context.getBean("lap");
l1.show();
LAPTOP l2 = (LAPTOP) context.getBean("lap2");
l2.show();
LAPTOP l3 = (LAPTOP) context.getBean("l2");
l3.show();
	}

}
