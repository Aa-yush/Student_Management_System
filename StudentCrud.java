/*

- interface just specify the methods declaration (implicitly public and abstract)
  - its all member are by deafult public 
  
Make an interface and declare methods which we have to use in this project to implement

*/

public interface StudentCrud {
	
	public  void  insert_stud ( Student s );
	public  void  get_all_stud();
	public  void  par_stud ( int rollno );
	public  void  update_stud ( int rollno );
	public  void  delete_stud ( int rollno );
	public  void  FileWrite();
}
	