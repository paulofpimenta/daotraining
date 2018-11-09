package com.person.architecture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.person.architecture.logic.Car;
import com.person.architecture.logic.Person;

public class DaoImpl implements Idao {
	
	//private String url = "jdbc:mysql://localhost:3306/personDB?serverTimezone=UTC";
	private String url = "jdbc:mysql://localhost:3306/personDB?serverTimezone=UTC";
	private String login = "root";
	private String password = "";
	Person p = new Person();
	
	public boolean loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("\nDriver loaded");
			return true;
		} catch (Exception ex) {
		    // handle any errors
		    System.out.println("Class not found : " + ex.getMessage());
		    return false;
		}
		
	}
	
	@Override
	public Connection connectDB () {
		// 1 . Check driver
		boolean isDriverPresent = loadDriver();
		Connection conn = null;
		// Check connection
		if (isDriverPresent) {
			try {
				conn = DriverManager.getConnection(url,login,password);
				System.out.println("Connection established");
			} 	catch (SQLException e) {
					e.printStackTrace();
			}
			
		}
		return conn;	
	}
	
	@Override
	public int addPerson(Person p) {
		try {
			Connection conn = connectDB();
			
			String sql = "INSERT INTO person(name,surname,age) VALUES(?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, p.getName());
			st.setString(2, p.getSurname());
			st.setInt(3, p.getAge());
			
			st.executeUpdate();
			
			conn.close();
			System.out.println("Person added");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return 0;
	}

	@Override
	public int changePerson(Person p) {
		try {
		Connection conn = connectDB();
		String sql = "UPDATE person SET name=?, surname=?, age=? WHERE id=?";
		PreparedStatement st = conn.prepareStatement(sql);
	
		
		st.setString(1, p.getName());
		st.setString(2, p.getSurname());
		st.setInt(3, p.getAge());
		st.setInt(4, p.getId());
		
		st.executeUpdate();
		System.out.println("Person modified" + p.getName());
	
		conn.close();
		return 1;
		} catch (Exception e) {
			e.printStackTrace();
			
			return 0;
		}
	}

	@Override
	public void deletePerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getPerson(int number) {
		// TODO Auto-generated method stub
		Connection conn = connectDB();
		Person p = new Person();
		try {
			String sql = "SELECT * FROM person WHERE id = ?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, number);
			ResultSet rs = st.executeQuery();
		
			rs.next();
			
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setSurname(rs.getString("surname"));
			p.setAge(rs.getInt("age"));
			
		conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return p;
	}

	@Override
	public List<Person> listAll() {
		Connection conn = connectDB();
		List<Person> allPerson = new ArrayList<Person>();
		
		try {

			String sql = "SELECT * FROM person";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Person p = new Person();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setSurname(rs.getString("surname"));
				p.setAge(rs.getInt("age"));
				allPerson.add(p);
			}
			
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return allPerson;
	}
	/**
	 * 
	 * 
	 */

	@Override
	public int addCar(Car c) {
		//Car car = new Car();
		try {
			Connection conn = connectDB();
			
			String sql = "INSERT INTO cars (brand, immatriculation, color, hp) VALUES(?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, c.getBrand());
			st.setString(2, c.getImmatriculation());
			st.setString(3, c.getColor());
			st.setInt(4, c.getHp());

			
			st.executeUpdate();
			
			conn.close();
			System.out.println("Car added");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return 0;
	}

	@Override
	public List<Car> listCars() {
		Connection conn = connectDB();
		List<Car> allCars = new ArrayList<Car>();
		try {

			String sql = "SELECT * FROM cars";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Car c = new Car();
				c.setIdCar(rs.getInt("idCar"));
				c.setBrand(rs.getString("brand"));
				c.setColor(rs.getString("color"));
				c.setImmatriculation(rs.getString("immatriculation"));
				c.setHp(rs.getInt("hp"));
				
				allCars.add(c);
			}
			
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return allCars;
	}

	@Override
	public Car getCars(int idCar) {
		// TODO Auto-generated method stub
		return null;
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
