package com.person.architecture.dao;

import java.sql.Connection;
import java.util.List;

import com.person.architecture.logic.Car;
import com.person.architecture.logic.Person;
/**
 * Interface Dao
 * @author ib
 *
 */

public interface Idao {
	
	public Connection connectDB();
	/**
	 * Method that adds transaction on the database
	 * @param t Transaction to be added
	 * @return 1 if ok and 0 if null
	 */
	public int addPerson(Person p);
	/**
	 * Method that modifies a transaction on the database
	 * @param t Transaction to be modified
	 * @return 1 if ok and 0 if null
	 */
	public int changePerson(Person p);
	/**
	 * Method that removes a transaction on the database
	 * @param t Transaction to be deleted
	 * @return 1 if ok and 0 if null
	 */
	public void deletePerson(Person p);
	/**
	 * Method that retrieves a transactions on the database
	 * @param t Transaction to be retrieved
	 * @return transaction
	 */
	public Person getPerson(int number);
	/**
	 * Method that retrieves all the transactions on the database
	 * @param t Transaction to modify
	 * @return a list of all transactions
	 */
	public List<Person> listAll();
	
	 // Car method's signature
	public int addCar(Car c);

	public List<Car> listCars();

	public Car getCars(int idCar);

	public int deleteCar(Car c);

	public void changeCar(Car c);


}
