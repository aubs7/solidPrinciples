public class OrderAction {
    private final Order orderProcessor;
    private final Invoice invoiceGenerator;
    private final Email emailNotifier;

    public OrderAction(Order orderProcessor, Invoice invoiceGenerator, Email emailNotifier) {
        this.orderProcessor = orderProcessor;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        double total = orderProcessor.calculateTotal(price, quantity);
        System.out.println("Order total: $" + total);
        orderProcessor.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice(fileName);
        emailNotifier.sendEmailNotification(email);
    }

}
