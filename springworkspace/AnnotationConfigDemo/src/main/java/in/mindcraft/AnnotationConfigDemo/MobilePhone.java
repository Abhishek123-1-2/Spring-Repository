package in.mindcraft.AnnotationConfigDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class MobilePhone {
	private int mid;
	private String  make;
	
    @Autowired
	private MemoryCard mcard;
	public MemoryCard getMcard() {
		return mcard;
	}
	public void setMcard(MemoryCard mcard) {
		this.mcard = mcard;
	}
	public MobilePhone(){
		System.out.println("mobilephone constructor...");
		mid=111;
		make="Nokia";
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
	public void display() {
		System.out.println(mid+" "+make);
		mcard.show();
	}

}
