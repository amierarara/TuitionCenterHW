public class TuitionCenter {
    protected Address address;
    public Name principalName;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    protected Name getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(Name principal) {
        this.principalName = principal;

    }
}

//    public TuitionCenter(String name, Address address, String principal) {
//        this.name = name;
//        this.address = address;
//        this.principal = principal;
//    }
//    public void setAddress(Address address) {
//        this.address = address;
//    }
////    public Center(String name, String address, String principal) {
////        this.name = name;
////        this.address = address;
////        this.principal = principal;
////    }
//    private Marks marks;
//
//    // setter and getter
//    // setter for name
//    public void setName(String name) {
//        this.name = name;
//    }
////    public void setAddress(Address address) {
////        this.address = address;
////    }
//
//    public String getName( ) {
//        return name;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public String getPrincipal() {
//        return principal;
//    }
//
//    public void setPrincipal(String principal) {
//        this.principal = principal;
//    }
//
//    public void setNumParticipants(int num) {
//        marks = new Marks();
//        marks.createData(num);
//
//    }
