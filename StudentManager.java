
/*   Mini_Project On Student_Management_System
*
*    This programs helps in to Store Student's data in Files and performs some operation on it-- 
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/


import java.util.*;   // import util package to use scanner class 
/*

Make an Student Manager class which manages operation of STUDENT_MANAGEMENT project

*/

public  class StudentManager {
	public static void main ( String[] args ) {
		
	Scanner sc = new Scanner ( System.in );  // object of scanner class	
	StudentImpl si = new StudentImpl();      // object of StudentImpl class
	int ch;            
	while ( true ) {
		
/*                Infinite Loop "For this menu"                 */

				System.out.println ( "\nMenu:-" );
				System.out.println ( "1.Insert Student Record" );
				System.out.println ( "2.View All Records" );
				System.out.println ( "3.View Particular Student Record" );
				System.out.println ( "4.Update Student Record" );
				System.out.println ( "5.Delete Student Record" );
				System.out.println ( "6.Exit" );
				System.out.println ( "Enter Your choice: " );
				ch = sc.nextInt();
				
				switch ( ch ) {
					case 1:	System.out.println ( "Enter Student Rollno: " );
							int rollno = sc.nextInt();
							sc.nextLine();
							System.out.println ( "Enter Student Name: " );
							String name = sc.nextLine();
							System.out.println ( "Enter Student Course: " );
							String course = sc.nextLine();
							
/*Make an object of Student class and pass value though parameterized constructor*/

							Student s = new Student ( rollno,name,course );
							
           /* call insert function and pass student object*/		
		   
							si.insert_stud ( s );
							
           /* call FileWrite funtn to write value in database*/
		   
							si.FileWrite(); 
							System.out.println ( "*******Insert Successfully*******" );							
							break;
					case 2: System.out.println ( "All Student Data Is:--" );
					
					 /* call get_all_stud function to display all data */
					 
							si.get_all_stud();		
							break;
					case 3: System.out.println ( "Enter Student Rollno: " );
							int r = sc.nextInt();
							
			/* call par_stud and passes roll number which we want to get that record*/											
							si.par_stud ( r );
							break;
					case 4: System.out.println ( "Enter Student Rollno: " );
							int p = sc.nextInt();
							
			/* Call update funtn and Passing rollnum  */
			
							si.update_stud ( p );
							
			      /* Write in File After Update */
				         
						  si.FileWrite(); 
							
							System.out.println ( "\n*******Update Successfully*******");
							break;
							 
					case 5: System.out.println ( "Enter Student Rollno: " );
							int t = sc.nextInt();
							
					/* Call delete funtn and passing rollnum  */
					
							si.delete_stud ( t );
							
						/* Write in File After Update */
	
							si.FileWrite();
							System.out.println ( "*******Deletion Successfully*******");
							break;
					case 6: System.exit ( 0 );
							break;
					default:System.out.println ( "Wrong Choice" );
					}
			}
		}
}