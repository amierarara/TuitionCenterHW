import java.util.ArrayList;
import java.util.Collections;

public class studentBatch{
    // data section
    // what is a studentBatch
    // a studentBatch is a list of students registered in a batch
    // "list of students"???? -> an array of Student

    public Student students[] = new Student[10];
    protected ArrayList<Float> listMarks = new ArrayList<>();
    protected ArrayList<Float> listMarksAllStud = new ArrayList<>();
    private int currsz = 0;
    // operation

    //method overloading
    //put into array of students[]
    // public void add(Student s){
    //     students[currsz] = s;
    //     currsz++;
    // }

    public int getCurrsz() {
        return currsz;
    }

    public void add(Student s, int i){
        students[i] = s;    // used for method find
        currsz++;
        ArrayList<String> listStud = new ArrayList<String>();
        listStud.add(students[i].name.getFName() + " " + students[i].name.getMName() + " " + students[i].name.getLName());
        //System.out.println(students[i].name.getFName());    // display name
        System.out.println("Students' name : " + listStud);
    }
    protected void addIC(int i){
        ArrayList<String> listIC = new ArrayList<>();

        if(currsz == 3){
            listIC.add(students[i].kp);
            listIC.add(students[i+1].kp);
            listIC.add(students[i+2].kp);
            System.out.println("Students' IC list : " + listIC);
        }
        else if(currsz == 2){
            listIC.add(students[i].kp);
            listIC.add(students[i+1].kp);
            System.out.println("Students' IC list : " + listIC);
        }

    }
    public void addAddress(int i){
        ArrayList<String> listAddr = new ArrayList<String>();
        if(currsz == 3){
            listAddr.add(students[i].address.getHouseUnit() + " " + students[i].address.getArea() + " " + students[i].address.getPostcode() + " " + students[i].address.getTown() + " " + students[i].address.getState());
            listAddr.add(students[i+1].address.getHouseUnit() + " " + students[i+1].address.getArea() + " " + students[i+1].address.getPostcode() + " " + students[i+1].address.getTown() + " " + students[i+1].address.getState());;
            listAddr.add(students[i+2].address.getHouseUnit() + " " + students[i+2].address.getArea() + " " + students[i+2].address.getPostcode() + " " + students[i+2].address.getTown() + " " + students[i+2].address.getState());;
            System.out.println("Students' address list : " + listAddr);
        }
        else if(currsz == 2){
            listAddr.add(students[i].address.getHouseUnit() + " " + students[i].address.getArea() + " " + students[i].address.getPostcode() + " " + students[i].address.getTown() + " " + students[i].address.getState());
            listAddr.add(students[i+1].address.getHouseUnit() + " " + students[i+1].address.getArea() + " " + students[i+1].address.getPostcode() + " " + students[i+1].address.getTown() + " " + students[i+1].address.getState());;
            System.out.println("Students' address list : " + listAddr);
        }
    }

    public void addNumYear(int i){
        ArrayList<Integer> listNumYear = new ArrayList<>();
        if(currsz == 3){
            listNumYear.add(students[i].numYear);
            listNumYear.add(students[i+1].numYear);
            listNumYear.add(students[i+2].numYear);
            System.out.println("Students' Year Intake list : " + listNumYear);
        }
        else if(currsz == 2){
            listNumYear.add(students[i].numYear);
            listNumYear.add(students[i+1].numYear);
            System.out.println("Students' Year Intake list : " + listNumYear);
        }
    }

    public void addSchoolName(int i){
        ArrayList<String> listSchoolName = new ArrayList<>();
        if(currsz == 3){
            listSchoolName.add(students[i].schoolname);
            listSchoolName.add(students[i+1].schoolname);
            listSchoolName.add(students[i+2].schoolname);
            System.out.println("Students' School list : " + listSchoolName);
        }
        else if(currsz == 2){
            listSchoolName.add(students[i].schoolname);
            listSchoolName.add(students[i+1].schoolname);
            System.out.println("Students' School list : " + listSchoolName);
        }
    }

    //SETTER method
    //find a particular student
    public boolean find(String fname){
        // loop thry the array students
        // for each student in students
        //  check wether name is the same as that in student
        for(int i = 0;i<currsz;i++){
            if (students[i].name.getFName()==fname)
                return true;
        }
        return false;
    }

    public void getMarksFromAllStud(){
        for(int i = 0;i<getCurrsz();i++){
            listMarksAllStud.addAll(students[i].listMarks);
        }
        Collections.sort(listMarksAllStud);
        System.out.println(listMarksAllStud);
    }
    public float calcAvgAllStud(){
        float totMarkAllStud = 0, avgResult = 0;
        for (int i = 0;i< listMarksAllStud.size();i++){
            totMarkAllStud+=this.listMarksAllStud.get(i);
        }avgResult = totMarkAllStud/(5*currsz);
        return avgResult;
    }
    public void calcMinAllStud(){
        Collections.sort(listMarks);
        System.out.println("Min mark among all students : " + listMarksAllStud.get(0));
    }
    public void calcMaxAllStud(){
        Collections.sort(listMarks);
        System.out.println("Max mark among all students : " + listMarksAllStud.get(listMarksAllStud.size() - 1));
    }
    //GETTTER method
    public boolean getfind(){
        return false;
    }
}


