package in.mindcraft.SpringDemo2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
private int rollno;
private String fname;
private String lname;
@Autowired
private Laptop lap;
public Student() {
	
}

public Student(int rollno, String fname, String lname, Laptop lap) {
	super();
	this.rollno = rollno;
	this.fname = fname;
	this.lname = lname;
	this.lap = lap;
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public Laptop getLap() {
	return lap;
}
public void setLap(Laptop lap) {
	this.lap = lap;
}
public void display() {
	System.out.println(rollno+" "+fname+" "+lname);
	lap.display();
}

}
