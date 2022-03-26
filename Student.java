/*
 Name: Yujin Bae
 Teacher: Mr. Guglielmi
 Date: October 2nd, 2020
 Assgnment: This is a class for creating a student
 */

// The "Student" class.
import java.awt.*;
import hsa.Console;

public class Student
{
    //declaration section
    String name;                  //this is a field to store the student's name.
    String course1, course2;      //these are fields to store the student's first and second courses.
    double mark1, mark2;          //these are fields to store the student's first and second marks.

    //the constructor will create a stuident with all the information
    //String for the name, Strings for the first course and the second course
    //doubles for the first mark and the second mark
    //initializes all fields with provided data
    public Student (String n, String c1, String c2, double m1, double m2)
    {
	this.name = n;
	this.course1 = c1;
	this.course2 = c2;
	this.mark1 = m1;
	this.mark2 = m2;
    }


    //this method will return the name of the student
    //argument: none
    //returns: String
    public String getName ()
    {
	return this.name;
    }


    //this method will return the first course of the student
    //argument: none
    //returns: String
    public String getCourse ()
    {
	return this.course1 + "\t " + this.course2;

    }

    //this method will return the avergae mark of the student
    //argument: none
    //returns: double
    public double getAverage ()
    {
	return (this.mark1 + this.mark2) / 2;
    }
} // Student class
