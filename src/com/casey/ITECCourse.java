package com.casey;
import java.util.*;

/**
 * Created by casey on 2/17/15.
 */
public class ITECCourse {
    //Data for an ITECCourse object to store
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;



    public void getCourseName(String name) {
        this.name = name;
    }

    public void setCourseName(int code) {
        this.code = code;
    }

    //Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }

    public void addStudent(String studentName) {
        if (this.students.size() == this.maxStudents) {
            System.out.println("Class has max number of students, " + this.students + " cannot be added. ");
        } else {
            students.add(studentName);
            System.out.println(studentName + " was added to " + this.name);
        }
        students.add(studentName);
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }

    public void writeCourseInfo() {
        // comment
        System.out.println("Course name: " + this.name);
        System.out.println("Course code " + this.code);
        System.out.println("Students enrolled: ");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled. ");
        System.out.println("The max number of students for this course is: " + this.maxStudents);

    }

    public int getNumberOfStudents() {
        return this.students.size();
    }

}
