public class OrderTest {

    public static void main(String[] args) {
        Order processOrder = new ProcessOrder();
        Invoice generateInvoice = new GenerateInvoice();
        Email notify = new Notif();

        OrderAction orderService = new OrderAction(processOrder, generateInvoice, notify);
        orderService.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }

}
