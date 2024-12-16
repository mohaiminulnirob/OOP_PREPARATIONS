package ComparatorComparable;

import java.util.*;

public  class Simple{
    public static void main(String args[]){

        ArrayList<Student> al=new ArrayList();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        System.out.println("Sorting by Name");

        Collections.sort(al,new NameComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by age");

        Collections.sort(al,new AgeComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        Collections.sort(al);
        System.out.println("sorting by rollno: ");
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
//lab 15
