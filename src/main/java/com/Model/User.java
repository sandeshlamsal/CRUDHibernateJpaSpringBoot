package com.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user") //jpa
//@Table(name="user") //jpa
public class User {
 
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO) //jpa
 public int id;
 @Column(name = "name")
 public String name;
 @Column(name = "password")
 public String pass;
 
 public User(){}
 
public User(int id, String name, String pass){
	 this.id=id;
	 this.name=name;
	 this.pass=pass;
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
} 
}
