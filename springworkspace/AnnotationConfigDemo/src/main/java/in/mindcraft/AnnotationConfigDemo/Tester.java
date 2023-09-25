package in.mindcraft.AnnotationConfigDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MobilePhone m1 = (MobilePhone)context.getBean("mobilePhone");
		m1.display();
		MobilePhone m2= (MobilePhone)context.getBean("mobilePhone");
		m2.display();
		MemoryCard m3= (MemoryCard)context.getBean("memoryCard");
		m3.show();
	}

}
