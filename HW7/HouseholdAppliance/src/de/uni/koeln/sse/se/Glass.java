package de.uni.koeln.sse.se;

public class Glass implements HouseholdItem{
	
	String name;
	int lenght;
	int width;
	int height;

	int thickness;

	
	public Glass(String name, int lenght, int width, int height, int thickness) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.thickness = thickness;
	
	}

	public void accept(Visitor v) {
		v.visitGlass(this);
	}

//Getters and Setters =

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(int lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getThickness() {
		return thickness;}

	public void setThickness(int thickness) {
		this.thickness = thickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	


}
