

public class Name{
    // rivate - only can be use in the class
    private String fname;
    private String mname;
    private String lname;

    //public Name(){} //default if not explicitly write constructor

    // constructor
    //no return name same as class
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    // SETTER METHOD = UNTUK SET NAME
    // GET METHOD = UNTUK GET NAME
    //public - can be called by other class
    public void setFName(String fname){
        // "this" refers to the class sttributes
        this.fname = fname;
    }

    public String getFName(){
        return fname;
    }

    public void setMName(String mname){
        // "this" referes to the class sttributes
        this.mname = mname;
    }

    public String getMName(){
        return mname;
    }

    public void setLName(String lname){
        // "this" referes to the class sttributes
        this.lname = lname;
    }

    public String getLName(){
        return lname;
    }
}
