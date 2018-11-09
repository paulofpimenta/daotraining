package com.person.architecture.application;

import java.util.ArrayList;
import java.util.List;

import com.person.architecture.logic.Person;
import com.person.architecture.service.IService;
import com.person.architecture.service.ServiceImpl;

public class PersonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IService service = new ServiceImpl();
	
		String[] names = {"Paulo", "Will", "Tom","George","Leonardo"};
		String[] surnames = {"Pimenta", "Smith", "Hanks","Clooney","DiCaprio"};
		Integer[] age = {36,46,50,53,48};
		
		// Creat person
		//Person p = new Person();
		
		//for (int i = 0; i < names.length; i++) {
		//	Person p = new Person();
		//	p.setName(names[i]);
		//	p.setSurname(surnames[i]);
		//	p.setAge(age[i]);
		//	service.addPerson(p);
		//}
		
		// List person
		//for (Person person : service.listAll()) {
		//	System.out.format("Person name is : %s; Surname:  %s; Age: %o", person.getName(), person.getName(), person.getAge());
		//}
		service.listAll().forEach(person -> System.out.format("\nPerson name is : %s; Surname:  %s; Age: %o", 
				person.getName(), person.getName(), person.getAge()));
		
		//Person get
		Person personGet = service.getPerson(1);
		System.out.println("Person retrieved is " + personGet);
		
		// delete
		//service.deletePerson(person);
		
		// update
		Person pUpdate = new Person();
		pUpdate.setName("Paulo");
		pUpdate.setSurname("Pimenta");
		pUpdate.setAge(37);
		pUpdate.setId(1);
	
		
		service.changePerson(pUpdate);
		
		
	}

}
