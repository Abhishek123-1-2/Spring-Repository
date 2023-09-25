package in.mindcraft.SpringCoreLifecycle;

public class Samosa {
private double price;


public Samosa() {
	super();
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}


}
