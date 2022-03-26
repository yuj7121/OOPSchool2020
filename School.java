/*
 Name: Yujin Bae
 Teacher: Mr. Guglielmi
 Date: October 2nd20
 Assgnment: This program will display a school with 4 students
 */

// The "School" class.
import java.awt.*;
import hsa.Console;

public class School
{
    //declaration section
    static Console c;           // The output console
    private Student s1, s2, s3, s4;     ////these are the fields for 4 students

    //the constructor to create a schoole with 4 students
    //Students for 
    //initailizes all fields with data provided
    School (Student a, Student b, Student c, Student d)
    {
	this.s1 = a;
	this.s2 = b;
	this.s3 = c;
	this.s4 = d;

    }


    //this method will display the names of the students in the school
    public void names ()
    {
	c.println (s1.getName ());
	c.println (s2.getName ());
	c.println (s3.getName ());
	c.println (s4.getName ());
	c.println ();
    }


    //this method will display the names and courses of the students in the school
    public void namesCourses ()
    {
	c.println (s1.getName ());
	c.println (s1.getCourse ());
	c.println (s2.getName ());
	c.println (s2.getCourse ());
	c.println (s3.getName ());
	c.println (s3.getCourse ());
	c.println (s4.getName ());
	c.println (s4.getCourse ());
	c.println ();
    }


    //this method will display the names and averages of the students in the school
    public void namesAverages ()
    {
	c.println (s1.getName ());
	c.println (s1.getAverage ());
	c.println (s2.getName ());
	c.println (s2.getAverage ());
	c.println (s3.getName ());
	c.println (s3.getAverage ());
	c.println (s4.getName ());
	c.println (s4.getAverage ());
	c.println ();
    }


    public static void main (String[] args)
    {
	c = new Console ();

	Student jane = new Student ("Jane", "SNC201", "ICS3UP", 78, 34);
	Student jim = new Student ("Jim", "CGC2P3", "MPM202", 84, 70);
	Student sara = new Student ("Sara", "ENG201", "SNC201", 67, 80);
	Student sam = new Student ("Sam", "ICS3UP", "CGC201", 91, 84);

	School s = new School (jane, jim, sara, sam);

	s.names ();
	s.namesCourses ();
	s.namesAverages ();

	// Place your program here.  'c' is the output console
    } // main method
} // School class
