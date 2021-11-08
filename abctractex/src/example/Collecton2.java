package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collecton2 {
    public static void main(String[] args) {
        List<Student> students=List.of(new Student(25,"ANIL"),
        new Student(200 ,"ANOOP"),
                new Student(56, "TOM"));
        System.out.println(students);
        List<Student> Sal=new ArrayList<>(students);
        Collections.sort(Sal);
        System.out.println(Sal);
    }
}