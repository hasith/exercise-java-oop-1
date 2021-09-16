package app;


public class Student {

    private String name;
    private String nic;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getNIC() {
        return this.nic;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Name: " + this.name);
        if (!"".equals(nic)) {
            sb.append(", NIC number: " + this.nic);
        }
        return sb.toString();
    }
}
