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
public class Student extends Person  {
  //Student is a child class of Person 
    
    double gpa;

    Student(String name, int i) {
        
    }
    
//getters and setters for gpa
    
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "gpa=" + gpa + '}';
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        
        return address;
        
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
