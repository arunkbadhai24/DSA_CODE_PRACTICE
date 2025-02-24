package functionalInterfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >=3.9;
    public static void main(String[] args) {

        filterStudentbyGradeLevel();
        filterStudentbyGpa();
        filterStudent();
        filterStudentOr();
        filterStudentNegate();
    }

    private static void filterStudentbyGradeLevel() {
        System.out.println("*********filterStudentbyGradeLevel********");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student ->{
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    private static void filterStudentbyGpa () {
        System.out.println("*********filterStudentbyGpa********");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student ->{
            if(p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    private static void filterStudent () {
        System.out.println("*********filterStudent********");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student ->{
            if(p2.and(p1).test(student)){
                System.out.println(student);
            }
        }));
    }
    private static void filterStudentOr () {
        System.out.println("*********filterStudentOr********");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student ->{
            if(p2.or(p1).test(student)){
                System.out.println(student);
            }
        }));
    }

    private static void filterStudentNegate () {
        System.out.println("*********filterStudentAnd********");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student ->{
            if(p2.or(p1).negate().test(student)){
                System.out.println(student);
            }
        }));
    }
}
