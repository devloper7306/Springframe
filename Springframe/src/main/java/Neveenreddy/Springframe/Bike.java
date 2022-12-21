package Neveenreddy.Springframe;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle{
	public void drive() {
		System.out.println("we ride bike");
	}
	

}
