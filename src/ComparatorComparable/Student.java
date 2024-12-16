package ComparatorComparable;

class Student implements  Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }
}  