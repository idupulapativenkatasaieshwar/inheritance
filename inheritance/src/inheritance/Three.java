package inheritance;
import java.util.*;
class Person1
{
	String name;
	int dob;
	Person1(String name,int dob)
	{
		this.name=name;
		this.dob=dob;
	}
	public String toString() {
		return "Person1 [name=" + name + ", dob=" + dob + "]";
	}
}
class Teacher extends Person1
{
	int sal;
	String subj;
	Teacher(String name, int dob,int sal,String subj) {
		super(name, dob);
		this.sal=sal;
		this.subj=subj;
	}
	public String toString() {
		return "Teacher [sal=" + sal + ", subj=" + subj + ", name=" + name + ", dob=" + dob + "]";
	}	
}
class Student extends Person1
{
	int sid;
	Student(String name, int dob,int sid) {
		super(name, dob);
		this.sid=sid;		
	}
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + "]";
	}
}
class CollegeStudent extends Student
{
	String cname;
	String year;
	CollegeStudent(String name, int dob, int sid,String cname,String year) {
		super(name, dob, sid);
	    this.cname=cname;
	    this.year=year;
	}
	public String toString() {
		return "CollegeStudent [cname=" + cname + ", year=" + year + ", sid=" + sid + ", name=" + name + ", dob=" + dob
				+ "]";
	}
	
	
}
public class Three {
	public static void main(String[]args)
	{
		Person1 p=new Person1("eshwar",2001);
		Teacher t=new Teacher("venkata sai",1967,50000,"soc");
		Student s=new Student("idupulapati",2003,130);
		CollegeStudent cs=new CollegeStudent("idupulapati venkata sai eshwar",2000,0130,"klu","third");
		 System.out.println(p);
		System.out.println(t);
		System.out.println(s);
		System.out.println(cs);	
	}
}