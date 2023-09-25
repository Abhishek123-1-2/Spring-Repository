package in.mindcraft.SpringAddition;

public class Addition {
private double a;
private double b;
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("Hitting int constructor....");
}
public Addition(double a,double b) {
	this.a=a;
	this.b=b;
	System.out.println("Hitting double constructor....");
	
	
}
public void doSum() {
	double result=(this.a+this.b);
	System.out.println("Addition is:"+result);
}

}
