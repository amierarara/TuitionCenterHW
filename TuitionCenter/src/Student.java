import java.util.ArrayList;
import java.util.Collections;

//onLy for a student
public class Student {

    // data / attributes
    protected int numStud = 0;
    protected Name name;
    protected String kp;
    protected Address address;
    protected int numYear;
    protected String schoolname;
    // array in java always dynamic
    protected float marks[] = new float[5];
    protected ArrayList<Float> listMarks = new ArrayList<>();

    protected Teacher teacherAssigned;
    //constructor
    // public Student(){

    // }


    //Name name = new Name();
    public Student(){
        // System.out.println("Succesfully created");
    }

    // methods or operations

    // so attributes nama's value = attribute at main(which is name)
    // if attributes set nama lain
    public void setName(Name thename){
        this.name = thename;
    }

    protected void setIC(String ic){
        this.kp = ic;
    }
    public void setAddress(Address addr){
        this.address = addr;
    }

    protected void setYear(int numYear){
        this.numYear = numYear;}

    public void setSchoolName(String schoolname) {
        this.schoolname = schoolname;
    }

    protected void setMarks(float mark, int i) throws Exception {
        // if(marks[i] < 0){
        //     System.out.println("Error Input!")
        //     return;
        // }else;
        //     marks[i] = mark;
        if(mark < 0)
            throw new Exception("Error in mark detected");
        this.marks[i] = mark;
        listMarks.add(mark);
    }

    protected float calcAvg(){
        float totMark = 0, avgResult = 0;
        for (int i = 0;i<5;i++){
            totMark+=this.marks[i];
        }avgResult = totMark/5;

        return avgResult;
    }

    void displayMarks(int i){
        System.out.println(name.getFName() + " marks : " + listMarks);
    }

    public void calcMin(){
        Collections.sort(listMarks);
        System.out.println(name.getFName() + " min marks : " + listMarks.get(0));
    }

    public void calcMax(){
        Collections.sort(listMarks);
        System.out.println(name.getFName() + " max marks : " + listMarks.get(listMarks.size() - 1));
    }

    protected void assignTeacher(float i) {
        if(i>65){
            System.out.println(name.getFName() + " will be in Mr Payne's class");
        }else
            System.out.println(name.getFName() + " will be in Mdm Henderson's class");
    }

    protected void assignTeacherJB(float i) {
        if(i>65){
            System.out.println(name.getFName() + " will be in Mr Kamal's class");
        }else
            System.out.println(name.getFName() + " will be in Ms Liana's class");
    }


    //  PURPOSE  : unit testing
//    public static void main(String[] args) {
//        Student stud = new Student();
//        try{    //try block : sth in here can cause exception
//            stud.setMarks(10, 0);
//            stud.setMarks(-20, 1);
//            stud.setMarks(30, 2);
//            stud.setMarks(40, 3);
//            stud.setMarks(50, 4);
//        } catch (Exception ex){ // catch block : action can be taken in case of Exception
//            System.out.println("Cannot continue to enter mark");
//            ex.printStackTrace();
//
//        }
//        stud.displayMarks();
//    }

}