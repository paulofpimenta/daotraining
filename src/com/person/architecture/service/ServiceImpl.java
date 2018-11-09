package com.person.architecture.service;

import java.util.List;

import com.person.architecture.dao.DaoImpl;
import com.person.architecture.dao.Idao;
import com.person.architecture.logic.Car;
import com.person.architecture.logic.Person;

/**
 * Implements IService
 * @author Paulo Pimenta
 *
 */

public class ServiceImpl implements IService {
	/*
	 * dao - must be initialized
	 */
	private Idao dao = new DaoImpl();
	
	@Override
	public int addPerson(Person p) {
		// TODO Auto-generated method stub
		return dao.addPerson(p);
	}

	@Override
	public int changePerson(Person p) {
		// TODO Auto-generated method stub
		return dao.changePerson(p);
	}

	@Override
	public void deletePerson(Person t) {
		// TODO Auto-generated method stub
		System.out.println("Peson deleted");
	}

	@Override
	public Person getPerson(int number) {
		// TODO Auto-generated method stub
		return dao.getPerson(number);
	}

	@Override
	public List<Person> listAll() {
		// TODO Auto-generated method stub
		return dao.listAll();
	}
	
	// Car implementation of IService

	@Override
	public int addCar(Car c) {
		// TODO Auto-generated method stub
		return dao.addCar(c);
	}

	@Override
	public List<Car> listCars() {
		// TODO Auto-generated method stub
		return dao.listCars();
	}

	@Override
	public Car getCars(int idCar) {
		// TODO Auto-generated method stub
		return dao.getCars(idCar);
	}

	@Override
	public int deleteCar(Car c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changeCar(Car c) {
		// TODO Auto-generated method stub
		
	}

}
