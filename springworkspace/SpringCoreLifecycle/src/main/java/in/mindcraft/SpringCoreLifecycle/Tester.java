package in.mindcraft.SpringCoreLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Samosa s1 = (Samosa) context.getBean("sam");
		System.out.println(s1);
	}

}
