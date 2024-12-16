package lab12;

public class Main {
    public static void main(String[] args) {
        Course c1=new Course(101,"ABC");
        Course c2=new Course(201,"DEF");
        Student s1=new Student(123);
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.seeCourseDetails();
    }

}
//class diagram
//Baile-palte code
//boilerplate code

