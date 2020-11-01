public class Customer {
    String name;
    String phone;
    String address;
    String date;


    public Customer(String minh_quang, String s, String ha_noi, String s1) {
    }

    public Customer(String name, String phone, String address, String date, String img) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.date = date;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }





    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
