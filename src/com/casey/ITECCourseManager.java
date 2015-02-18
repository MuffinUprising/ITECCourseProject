package com.casey;

/**
 * Created by casey on 2/17/15.
 */
public class ITECCourseManager {
    public static void main(String args[]) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse javaProgrammingCourse = new ITECCourse("Java Programming", 2545, 24);

        //Add some students
        javaProgrammingCourse.addStudent("Gus");
        javaProgrammingCourse.addStudent("Harry");
        javaProgrammingCourse.addStudent("Izzy");

        javaProgrammingCourse.writeCourseInfo();

        //Test the add students method with a sample class//This class has a max of 3 students
        ITECCourse smallCourse = new ITECCourse("Small Course", 1111, 3);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        //We can't add this student – what happens?
        smallCourse.addStudent("Marigold");

        String smallCourseName = smallCourse.getCourseName();
        System.out.println(smallCourseName);

        smallCourse.writeCourseInfo();

    }
}