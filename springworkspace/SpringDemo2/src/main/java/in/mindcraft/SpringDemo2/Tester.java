package in.mindcraft.SpringDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student s1 = (Student) context.getBean("stu");
		s1.display();
		Laptop l1 = (Laptop)context.getBean("lap");
		l1.display();
	}

}
