package app;

public abstract class Person {

    protected String name;
    protected String nic;
    protected int birthYear;
    
    public String getName() {
        return this.name;
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

    public void setBirthYear(int year) {
        this.birthYear = year;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getAge() {
        return 0;
    }
}
