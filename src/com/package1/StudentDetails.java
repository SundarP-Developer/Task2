package com.package1;

public class StudentDetails {

	private int Id;
	private String name;
	private int mark1;
	private int mark2;
	
	public StudentDetails(int id, String name,int mark1, int mark2) {
		this.Id=id;
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	
	@Override
	public String toString() {
		return "StudentDetails \nId=" + Id + ",\nName=" + name + ",\nMark1=" + mark1 + ",\nMark2=" + mark2 + ".\n";
	}
	
	
}
