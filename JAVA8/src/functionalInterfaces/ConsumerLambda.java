package functionalInterfaces;

import data.Student;
import data.StudentDatabase;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambda {
    static Consumer<Student> c2 =(student) -> System.out.println(student);
    static Consumer<Student> c3 =(student) -> System.out.println(student.getName());
    static Consumer<Student> c4 =(student) -> System.out.println(student.getAcitvities());

    public static void printNames(){
        System.out.println("printNames");
        List<Student> studentList=  StudentDatabase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities");
        List<Student> studentList= StudentDatabase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); // consumer chaining

    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition");
        List<Student> studentList= StudentDatabase.getAllStudents();
        studentList.forEach(
                student -> {
                    if(student.getGradeLevel()>=3){
                        c3.andThen(c4).accept(student);
                    }
                }
        ); // consumer chaining

    }
    public static void main(String[] args) {


        //Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        //c1.accept("java8");
//        c1.accept(null);
        //printNames();


        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
