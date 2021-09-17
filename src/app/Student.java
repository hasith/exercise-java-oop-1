package app;


public class Student extends Person implements IPerson{

    private String nic;

    public Student() {
        
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String nic) {
        this.name = name;
        this.nic = nic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIC() {
        return this.nic;
    }

    public void setNIC(String nic) {
        this.nic = nic;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Name: " + this.name);
        if (nic != null) {
            sb.append(", NIC number: " + this.nic);
        }
        return sb.toString();
    }
}
