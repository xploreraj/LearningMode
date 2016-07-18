package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rbiswas on 6/7/2015.
 */

class Student implements Comparable<Student> {
    String name;
    int rollNumber;
    int rank;

    public Student(String name, int rollNumber, int rank) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.rank = rank;
    }

    //default sorting based on rollNumber
    public int compareTo(Student student) {
        return this.rollNumber - student.rollNumber;
    }

    public String toString(){
        return name;
    }
}

public class ComparableAndComparatorTest {
    public static void main(String[] args) {
        Student s1 = new Student("Abhi",1,3);
        Student s2 = new Student("Asha",2,10);
        Student s3 = new Student("Jacky",3,7);
        Student s4 = new Student("Ron",4,10);

        List<Student> students = new ArrayList<Student>();
        students.add(s4);
        students.add(s2);
        students.add(s3);
        students.add(s1);

        System.out.println("Before sorting:");
        System.out.println(students + "\n");

        //1. This uses default comparison, from Fruits class
        Collections.sort(students);

        System.out.println("Using default sorting (rollnumber):");
        System.out.println(students + "\n");

        //2. Providing a comparator to override default comparison
        Comparator<Student> rankComparator = new Comparator<Student>() {
            @Override
            public int compare(Student stud1, Student stud2) {
                int diff = stud1.rank - stud2.rank;
                if (diff==0)
                    //if rank is same, sort by rollnumber
                    diff = stud1.rollNumber-stud2.rollNumber;
                return diff;
            }
        };

        Collections.sort(students,rankComparator);

        System.out.println("Using overridden sorting logic (rank): ");
        System.out.println(students);
    }
}
