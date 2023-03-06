public class Address {
    int lotUnit;
    String area;
    int postcode;
    String town;
    String state;
    public Address(int lotUnit, String area, int postcode, String town, String state) {
        this.lotUnit = lotUnit;
        this.area = area;
        this.postcode = postcode;
        this.town = town;
        this.state = state;
    }

    public int getHouseUnit() {
        return lotUnit;
    }

    public void setHouseUnit(int houseUnit) {
        this.lotUnit = houseUnit;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
