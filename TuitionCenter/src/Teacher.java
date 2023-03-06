public class Teacher{
    // data / attributes
    protected Name name;
    protected String ic;
    protected Address address;
    protected String qualification;
    protected int numyearexp;
    protected String dateJoined;
    protected int numYearInCenter;

    public Name getNameTeacher() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setIC(String ic) {
        this.ic = ic;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setNumyearexp(int numyearexp) {
        this.numyearexp = numyearexp;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setNumYearInCenter(int numYearInCenter) {
        this.numYearInCenter = numYearInCenter;
    }
}