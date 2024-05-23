public class GenerateInvoice implements Invoice {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);

    }
}
