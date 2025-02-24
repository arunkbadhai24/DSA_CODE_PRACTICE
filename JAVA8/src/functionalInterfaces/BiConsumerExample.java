package functionalInterfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){

        BiConsumer<String, List<String>> biConsumer =(name,activities) -> System.out.println(name +" : "+activities);
        List<Student> studentlist = StudentDatabase.getAllStudents();
        studentlist.forEach((student -> biConsumer.accept(student.getName(),student.getAcitvities())));
    }


    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer =(a,b)->{
            System.out.println("a :"+a +" , b :"+b);
        };

        biConsumer.accept("java7", "java8");

        BiConsumer<Integer,Integer> multiply = (a,b)->{
            System.out.println("Multiplication is :"+(a*b));
        };


        BiConsumer<Integer,Integer> division = (a,b)->{
            System.out.println("Division is :"+(a/b));
        };

        multiply.accept(1,2);
        division.accept(4,2);

        nameAndActivities();
    }
}
