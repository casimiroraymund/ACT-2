public class Restaurant {
    public static void main(String[] args) {

        Employee employee = new Employee("Almendras", "Maysan Branch");
        Customer customer = new Customer("Casimiro", "09912345678");
        Orders order = new Orders("Pares Overload", 115);
        Table table = new Table(1, 4);

        customer.placeOrder(order);
        employee.manageTable(table);
        table.assignOrder(order);

        System.out.println(
                employee.getIdentity() + "\n" +
                        customer.getIdentity() + "\n" +
                        table.getIdentity() + "\n" +
                        order.getIdentity()
        );
    }
}