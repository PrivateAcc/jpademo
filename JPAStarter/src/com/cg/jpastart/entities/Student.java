package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="stu_record")    //optional            table annotation to change the table name 
public class Student implements Serializable {                     //in japa we dont create tables manually    2. properties and column names will be same  
	                                                                       //to change column name we need to use column annotation
	                                                                   
	private static final long serialVersionUID = 1L;
	@Id                                                                           //every entity should have primary keyotherwise it will throw identity exception
	@GeneratedValue(strategy=GenerationType.AUTO)                                //to generate primary key automatically, it may create issue on some systems and is optional
	private int studentId;                                     //@sequencegenerator used for custom made names
	private String name;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
