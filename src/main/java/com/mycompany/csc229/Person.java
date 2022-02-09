/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc229;

/**
 *
 * @author soblab
 */
public abstract class Person {
	
	private String name;
	protected String address; //address is protected so we can get access to it in child class
	private short age;
	
	// constructor that takes only two paras
	public Person(String name, short age) {
		super();
		this.name = name;
		this.age = age;
	}
	//setter and getter for Name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public abstract String getAddress() ;
	
	public abstract void setAddress(String address);
	
	//setter and getter for Age
	public short getAge() {
		return age;
	}
	
	public void setAge(short age) {
		this.age = age;
	}
	
}
