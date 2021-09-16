package app;


public class Student implements IPerson{

    private String name;
    private String nic;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String nic) {
        this.name = name;
        this.nic = nic;
    }

    public String getName() {
        return this.name;
    }

    public String getNIC() {
        return this.nic;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Name: " + this.name);
        if (nic != null) {
            sb.append(", NIC number: " + this.nic);
        }
        return sb.toString();
    }
}
