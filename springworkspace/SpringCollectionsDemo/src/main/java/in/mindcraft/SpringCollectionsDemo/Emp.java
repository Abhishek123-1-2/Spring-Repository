package in.mindcraft.SpringCollectionsDemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
private String name;
private List<String> phones;
private Set<String> adresses;
private Map<String,String> courses;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAdresses() {
	return adresses;
}
public void setAdresses(Set<String> adresses) {
	this.adresses = adresses;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public void show() {
	System.out.println(name+" "+phones+" "+adresses+" "+courses);
}
}
