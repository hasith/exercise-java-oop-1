package app;


public class Instructor implements IPerson  {
    
    private String name;

    private String nic;

    public Instructor() {

    }

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
