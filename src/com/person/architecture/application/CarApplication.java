package com.person.architecture.application;

import com.person.architecture.logic.Car;
import com.person.architecture.logic.Person;
import com.person.architecture.service.IService;
import com.person.architecture.service.ServiceImpl;

public class CarApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IService service = new ServiceImpl();
		
		//String[] brand = {"Toyota", "Renaut", "Citroen","Peugeot","Kia"};
		//String[] immatriculation = {"AA-301-BA", "AC-613-AEE", "FA-109-DA","BA-849-BF","FA-659-BA"};
		//String[] color = {"blue","green","yellow","pink","white"};
		//Integer[] hp = {746 ,567,678,876,443};
		
//		for (int i = 0; i < brand.length; i++) {
//			Car c = new Car();
//			c.setBrand(brand[i]);
//			c.setImmatriculation(immatriculation[i]);
//			c.setColor(color[i]);
//			c.setHp(hp[i]);
//			service.addCar(c);
//		}
		
		// Get all car
		
		service.listCars().forEach(car -> System.out.format("\nCar Brand : %s; Immatriculation:  %s; Color: %s, HP: %o", 
				car.getBrand(), car.getImmatriculation(), car.getColor(),car.getHp()));
		
	
		// get a car
		System.out.println("Car retrieved is " + service.getCars(1));
		}
	

	
		
	
		

}
