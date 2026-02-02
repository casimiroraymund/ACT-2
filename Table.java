public class Table {

    public int number;
    public int capacity;
    public Orders order; // Composition

    public Table(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public void assignOrder(Orders order) {
        this.order = order;
    }

    public String getIdentity() {
        return "I am the Table Class. I am table number " + number +
                " and I can accomodate " + capacity + " people.";
    }
}
