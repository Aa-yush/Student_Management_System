import java.util.*;
import java.io.*;

public class StudentImpl implements StudentCrud,Serializable {
	Scanner sc = new Scanner ( System.in );
	public Student stud[] = new Student[5];  // Student type of Array which store object 
	int i = -1;        // set i = -1 , which shows blank array

    public void insert_stud ( Student s ) {
		if( i > 4 )                 // if value of i is greater than 4 its means Overflow
			System.out.println ( "OverFlow" ) ;
		else {
		     i++;          // increment by 1
			stud[i] = s;   // Now Student object store in Student type of Array "stud"
		    }					
   }
   
	public void get_all_stud()  {
		if(i==-1)
			System.out.println("No data To print");
		else{
		
            /* Make an Student type of Array data which is null initialized */		
		
		Student data[] = null; 
     
			/* Make an try block to handle Exception Like FileNotFound Exception */
		
		try{
			
			/* Make an object of ObjectInputStream to read data from File*/ 			 
	    
    		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("D:\\Ayush's Folder\\JAVA\\JAVA Program\\StudentMini_Project\\Database.txt"));
			
			/* 
			
			Read data from File and store in variable data
		     	readObject funtn and typecast it into Student type			
			*/
			
           data=(Student[])oi.readObject(); 
		   
			
			
		    for ( int x=0; x<data.length;x++ ) {
			        System.out.println ( "Student Roll No is: "+stud[x].getRollNo() );
					System.out.println ( "Student Name is: "+stud[x].getName() );
					System.out.println ( "Student Course is: "+stud[x].getCourse() );
					System.out.println();
					}
			
			/*Catch after try block which catches the exception and handled - It helps in to stop crush the program*/
			
			} catch ( Exception e ) {
			System.out.print ( e );
		 }
	}
}
	
	    public void par_stud ( int rollno )  {		
				
			Student dat[]=null;
				if( i == -1 )
					System.out.println("No Data Available");
				else{
			
		 try {
			 
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("D:\\Ayush's Folder\\JAVA\\JAVA Program\\StudentMini_Project\\Database.txt"));
			dat=(Student[])oi.readObject();
			
                for(int y=0; y < dat.length; y++){		
					if(stud[y].getRollNo() == rollno){
					System.out.println ( "Following Data is ---" ) ;
					System.out.println ( "Student Roll No is: "+stud[y].getRollNo() );
					System.out.println ( "Student Name is: "+stud[y].getName() );
					System.out.println ( "Student Course is: "+stud[y].getCourse() );
					System.out.println();
					}     
				}
			} catch ( Exception e ) {
		 System.out.print ( e );
		        }
			}
	}
		
		public void update_stud ( int rollno ) {
	
		Student d[] = null;
			
		 try {
			 
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Ayush's Folder\\JAVA\\JAVA Program\\StudentMini_Project\\Database.txt"));
			d=(Student[])ois.readObject();
			
                for(int z=0;z<d.length;z++) {
				if ( stud[z].getRollNo() == rollno ){ // condition     					
			    int ch;
			    System.out.println ( "Enter element what you want to update:-" );
				System.out.println ( "Options are:-" );
				System.out.println ( "1.Edit Rollno: " );
				System.out.println ( "2.Edit Name: " );
				System.out.println ( "3.Edit Course: " );
				System.out.println ( "Enter your Choice: " );
				ch = sc.nextInt();
				switch ( ch ) {
					
				case 1: System.out.println ( "New Roll No is: " );
						int a = sc.nextInt();
						stud[z].setRollNo ( a );// set new Rollnumber							
						break;
				case 2:	System.out.println ( "New Name is: " );
						sc.nextLine();
				        String b = sc.nextLine();
					    stud[z].setName ( b );// set new name
						break;
				case 3:	System.out.println ( "New Course is: " );
						sc.nextLine();
						String c = sc.nextLine();
						stud[z].setCourse ( c );  // set new course						
						break;
				default:System.out.println ( "Wrong Choice" );
				}
			}
		}
	}catch ( Exception e ) {
		 System.out.print ( e );
		        }
    				
}			

				public void delete_stud(int rollno){
					
				if ( i == -1 )    // if i=-1 it means Array is blank
					System.out.println ( "No Student Record to delete" );
				else {
						int x = 0;
					for( x = 0 ; x <= i ; x++ ){      // condition
					if(stud[x].getRollNo() == rollno)
					break;
						}
					do {
					stud[x] = stud[x+1];       // swap
					x++;                             
					} while ( x <= i );   // loop
				}
			--i;
            }

		/*FileWrite Function which helps in to store data in file*/
			
 public void FileWrite() {
	 
	 /* Make an try block to handle Exception Like FileNotFound Exception */
	 
	 try {
		 
		 /* Make an object of ObjectOutputStream to write data in File*/ 
		 
		ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("D:\\Ayush's Folder\\JAVA\\JAVA Program\\StudentMini_Project\\Database.txt"));
	
		oo.writeObject ( stud );  // writeObject method which store stud Array
		
		/*Catch after try block which catches the exception and handled - It helps in to stop crush the program*/
			
		} catch ( Exception e ) {
		 System.out.print ( e );
			}
	}
}


