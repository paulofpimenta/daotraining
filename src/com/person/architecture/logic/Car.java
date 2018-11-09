package com.person.architecture.logic;

public class Car {

	private int idCar;
	private String brand;
	private String immatriculation;
	private String color;
	private int hp;
	/**
	 * @return the idCar
	 */
	public int getIdCar() {
		return idCar;
	}
	/**
	 * @param idCar the idCar to set
	 */
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the immatriculation
	 */
	public String getImmatriculation() {
		return immatriculation;
	}
	/**
	 * @param immatriculation the immatriculation to set
	 */
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Voiture [idCar=" + idCar + ", brand=" + brand + ", immatriculation=" + immatriculation + ", color="
				+ color + ", hp=" + hp + "]";
	}
	
	
}
