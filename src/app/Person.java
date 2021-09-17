package app;

public abstract class Person {

    protected String name;
    protected String nic;
    
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
}
