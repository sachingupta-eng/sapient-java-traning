class Student
{ 
	int rollNo; 
String name;
void display () 
{ 
	System.out.println ("Student Roll Number is: " + rollNo);
System.out.println ("Student Name is: " + name);
}
}
class StudentDemo
{ 
	public static void main(String args[])
Student s = new Student ();
s.display ();
}
}