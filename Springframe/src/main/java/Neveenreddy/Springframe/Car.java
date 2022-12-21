package Neveenreddy.Springframe;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle{
	
	public void drive() {
		System.out.println("we can drive car");
	}

}
