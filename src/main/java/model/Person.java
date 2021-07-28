package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

//This will be data for hybernate table

@Entity
@Table(name="person")
@Data
@NoArgsConstructor
public class Person {
	
	@Id//In order to give primary key
	@GeneratedValue(strategy = GenerationType.AUTO)// Gives automatic id 
	private Integer id;
	private String namf;
	private String naml;
	private int age;

}
