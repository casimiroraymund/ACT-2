public class Orders {

    public String item;
    public int price;

    public Orders(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public void prepare() {
        // Preparing the order
    }

    public String getIdentity() {
        return "I am the Orders Class. The ordered item is " + item +
                " and it costs " + price + " pesos.";
    }
}
