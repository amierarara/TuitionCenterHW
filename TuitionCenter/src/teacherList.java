import java.util.ArrayList;
public class teacherList {
    private int currAmtTeacher = 0;
    public Teacher teachers[] = new Teacher[10];
    public int getCurrAmtTeacher() {
        return currAmtTeacher;
    }
    public void add(Teacher s, int i){
        teachers[i] = s;    // used for method find
        currAmtTeacher++;
        ArrayList<String> listTeacher = new ArrayList<String>();
        listTeacher.add(teachers[i].name.getFName() + " " + teachers[i].name.getMName() + " " + teachers[i].name.getLName());
        //System.out.println(students[i].name.getFName());    // display name
        System.out.println("Teachers' name : " + listTeacher);
    }
    protected void addIC(int i){
        ArrayList<String> listIC = new ArrayList<>();
        listIC.add(teachers[i].ic);
        listIC.add(teachers[i+1].ic);
        System.out.println("Teachers' IC list : " + listIC);
    }
    protected void addAddress(int i){
        ArrayList<String> listAddr = new ArrayList<String>();
        listAddr.add(teachers[i].address.getHouseUnit() + " " + teachers[i].address.getArea() + " " + teachers[i].address.getPostcode() + " " + teachers[i].address.getTown() + " " + teachers[i].address.getState());
        listAddr.add(teachers[i+1].address.getHouseUnit() + " " + teachers[i+1].address.getArea() + " " + teachers[i+1].address.getPostcode() + " " + teachers[i+1].address.getTown() + " " + teachers[i+1].address.getState());;
        System.out.println("Teachers' address list : " + listAddr);
    }
    protected void addQualification(int i){
        ArrayList<String> listTeacherQual = new ArrayList<>();
        listTeacherQual.add(teachers[i].qualification);
        listTeacherQual.add(teachers[i+1].qualification);
        System.out.println("Teachers' Qualification list : " + listTeacherQual);
    }
    protected void addNumYearExp(int i){
        ArrayList<Integer> listNumYearExp = new ArrayList<>();
        listNumYearExp.add(teachers[i].numyearexp);
        listNumYearExp.add(teachers[i+1].numyearexp);
        System.out.println("Teachers' Number of Year Experience list : " + listNumYearExp);
    }
    protected void addDateJoined(int i){
        ArrayList<String> listDateJoined = new ArrayList<>();
        listDateJoined.add(teachers[i].dateJoined);
        listDateJoined.add(teachers[i+1].dateJoined);
        System.out.println("Teachers' Date Joined Tuition Center list : " + listDateJoined);
    }
    protected void addNumYearsIncenter(int i){
        ArrayList<Integer> listNumYearsIncenter = new ArrayList<>();
        listNumYearsIncenter.add(teachers[i].numYearInCenter);
        listNumYearsIncenter.add(teachers[i+1].numYearInCenter);
        System.out.println("Teachers' Number of Years in Center list : " + listNumYearsIncenter);
    }
}
