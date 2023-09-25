package in.mindcraft.SpringApp1;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int rollno;
	private String name;
	@Autowired
	private Adress resd;
	@Autowired
	private Laptop lap;
	
	
	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	public Student() {
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress getResd() {
		return resd;
	}

	public void setResd(Adress resd) {
		this.resd = resd;
	}
	public void display() {
		System.out.println(rollno+" "+name);
		resd.display();
		lap.display();
	}

}
