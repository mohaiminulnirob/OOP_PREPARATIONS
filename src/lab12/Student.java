package lab12;
import java.util.ArrayList;

public class Student {
    ArrayList<Course> courselist;
    int studentId;
    Student(int studentId){
        this.studentId=studentId;
        courselist=new ArrayList<>();
    }
    void addCourse(Course course){
        courselist.add(course);
    }
    void seeCourseDetails(){
        for(int i=0;i<courselist.size();i++){
            System.out.println(courselist.get(i).course_id + courselist.get(i).title );
        }
    }
}
