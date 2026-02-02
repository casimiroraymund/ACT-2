public class Customer {

    public String name;
    public String phoneNumber;
    public Orders order;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void placeOrder(Orders order) {
        this.order = order;
    }

    public String getIdentity() {
        return "I am the Customer Class. My name is " + name +
                " and my contact number is " + phoneNumber + ".";
    }
}
