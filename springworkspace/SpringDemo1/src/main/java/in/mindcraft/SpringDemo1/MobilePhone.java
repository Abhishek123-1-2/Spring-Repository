package in.mindcraft.SpringDemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobilePhone {
private int mid;
private String make;
@Autowired
private MemoryCard mcard;
public MobilePhone() {
	mid=101;
	make="Samsung";
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public MemoryCard getMcard() {
	return mcard;
}
public void setMcard(MemoryCard mcard) {
	this.mcard = mcard;
}
public void display() {
	System.out.println(mid+" "+make);
	mcard.show();
}

}
