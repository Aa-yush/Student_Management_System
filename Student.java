import java.io.*;      // import input-output package to use serializable class

/* 

Make Student Class which has Instance member variable to store information about Student

*/
public class Student implements Serializable { 
	
	private int rollno;     
	private String name;
	private String course;
/*
Making POJO methods which hai setter and getter methods 
setter method for assign the values && getter method to get the values 

*/	
	public void setRollNo ( int rollno ) {
		this.rollno = rollno;	
	}
	
	public void setName ( String name ) { 
		this.name = name;	
	}
	
	public void setCourse ( String course ) {
		this.course = course;	
	}
	
	public int getRollNo() {
		return ( rollno );
	}
	
	public String getName() {
		return ( name );
	}
	
	public String getCourse() {
		return ( course );
	}

/*

Making a parameterized constructor to assign values all values in variables

*/	
	
	public Student ( int rollno, String name, String course ) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
}