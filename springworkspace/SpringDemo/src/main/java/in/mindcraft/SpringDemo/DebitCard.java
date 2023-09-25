package in.mindcraft.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class DebitCard {
	@Autowired
public Adress adress;

public DebitCard() {
	
}
public DebitCard(Adress adress) {
	System.out.println("Hitting Constructor...");
	this.adress = adress;
}

public Adress getAdress() {
	return adress;
}

public void setAdress(Adress adress) {
	System.out.println("Hitting Setter Method");
	this.adress = adress;
}
public void details() {
	adress.display();
}

}
