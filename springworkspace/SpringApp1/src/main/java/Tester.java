

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mindcraft.SpringApp1.Student;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student s1 = (Student)context.getBean("stu1");
		s1.display();
		//Adress a1 = (Adress) context.getBean("add");
		//a1.display();
	}

}
