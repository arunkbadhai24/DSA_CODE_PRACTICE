package data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */

        Student student1 = new Student
                ("Adam", "male", 3.6,2 , Arrays.asList("swimming","basketball","volleyball"));

        Student student2 = new Student
                ("Jenny", "female", 3.8,2 , Arrays.asList("swimming","gymnastics","soccer"));


        /**
         * 3rd grade students
         */

        Student student3 = new Student
                ("Emily", "female", 4.0,3 , Arrays.asList("swimming","gymnastics","aerobics"));

        Student student4 = new Student
                ("Dave", "male", 3.9,3 , Arrays.asList("swimming","gymnastics","soccer"));



        /**
         * 4th grade students
         */

        Student student5 = new Student
                ("Sophia", "female", 3.5,4 , Arrays.asList("swimming","dancing","football"));

        Student student6 = new Student
                ("James", "male", 3.9,4 , Arrays.asList("swimming","basketball","baseball","football"));

        List<Student> students =Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
