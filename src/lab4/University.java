package lab4;

public class University {

    private int UGCid;

    //private field is accessible only by public member method
    public University(int UGCid){

        this.UGCid=UGCid;
    }
    void enroll(int studentId,String courseCode, Coursetype type){
        if(type==Coursetype.MAJOR)
            System.out.println("student "+ studentId+" enrolled in Major course "+courseCode);
        else if(type==Coursetype.MINOR)
            System.out.println("student "+ studentId+" enrolled in Minor course "+courseCode);
        else
            System.out.println("student "+ studentId+" enrolled in OPT course "+courseCode);
    }
    void enroll(int studentId,String courseCode,String supervisor){
        System.out.println("student "+studentId+" enrolled in project course "
        + courseCode+ " under "+ supervisor);
    }
    public int getId() {

        return UGCid;
    }

}