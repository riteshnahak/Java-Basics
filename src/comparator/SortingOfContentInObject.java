package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfContentInObject {
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(22,"B","jdbc"));
        students.add(new Student(6,"Z","jsp"));
        students.add(new Student(11,"A","servlet"));


        Collections.sort(students);
        // if first object-second obj= positive no then swap
        // else dont swap
        System.out.println(students);

    }
}

