import java.util.ArrayList;

public class TuitionCenterList {
    protected TuitionCenter TC[] = new TuitionCenter[10];
    protected ArrayList<Name> listPrincipalName = new ArrayList<>();
    protected ArrayList<Address> listTuitCenterList = new ArrayList<>();

    protected void addPrincipalList(Name principalName){
        listPrincipalName.add(principalName);
    }

    protected void addAddress(Address addr){
        listTuitCenterList.add(addr);
    }

}
