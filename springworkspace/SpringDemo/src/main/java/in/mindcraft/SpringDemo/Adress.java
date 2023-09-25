package in.mindcraft.SpringDemo;

public class Adress {
public String name;
public String city;
public Adress(String name, String city) {
	this.name = name;
	this.city = city;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public void display() {
	System.out.println(name+" "+city);
}
}
