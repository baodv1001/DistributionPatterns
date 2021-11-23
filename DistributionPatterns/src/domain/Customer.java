package domain;

public class Customer {
    private String name, phone, address;

    public Customer(String nm, String ph, String addr) {
        name = nm;
        phone = ph;
        address = addr;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String ph) {
        phone = ph;
    }

    public void setAddress(String addr) {
        address = addr;
    }
    // business logic goes here
}
