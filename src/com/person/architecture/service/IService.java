package com.person.architecture.service;

import java.util.List;

import com.person.architecture.logic.Car;
import com.person.architecture.logic.Person;


public interface IService {
	/**
	 * Method that adds Person on the database
	 * @param t Person to be added
	 * @return 1 if ok and 0 if null
	 */
	public int addPerson(Person p);
	/**
	 * Method that adds Person on the database
	 * @param t Person to be added
	 * @return 1 if ok and 0 if null
	 */
	public int changePerson(Person p);
	/**
	 * Method that adds Person on the database
	 * @param t Person to be added
	 */
	public void deletePerson(Person p);
	/**
	 * Method that adds Person on the database
	 * @param number  The number of Person to be retrieved
	 * @return Person
	 */
	public Person getPerson(int number);
	/**
	 * Method that adds Person on the database
	 * @return all the Persons
	 */
	public List<Person> listAll();
	
	
	
	// Car service signature
	 // Car method's signature
	public int addCar(Car c);

	public List<Car> listCars();

	public Car getCars(int idCar);

	public int deleteCar(Car c);

	public void changeCar(Car c);



}
