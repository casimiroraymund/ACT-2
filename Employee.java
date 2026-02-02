public class Employee {

    public String name;
    public String location;

    public Employee(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void manageTable(Table table) {
    }

    public String getIdentity() {
        return "I am the Employee Class. My name is " + name +
                " and I work at the " + location + ".";
    }
}
