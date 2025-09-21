public class Invoice {
    private int invoiceID;
    private String date;  // keeping as String for simplicity
    private double negotiatedPrice;
    private double tax;
    private double licenseFee;
    private double totalPrice;

    public Invoice(int invoiceID, String date, double negotiatedPrice, double tax,
                   double licenseFee, double totalPrice) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.negotiatedPrice = negotiatedPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.totalPrice = totalPrice;
    }

    public int getInvoiceID() { return invoiceID; }
    public String getDate() { return date; }
    public double getNegotiatedPrice() { return negotiatedPrice; }
    public double getTax() { return tax; }
    public double getLicenseFee() { return licenseFee; }
    public double getTotalPrice() { return totalPrice; }

    @Override
    public String toString() {
        return "Invoice [ID=" + invoiceID + ", Date=" + date +
               ", Negotiated Price=" + negotiatedPrice +
               ", Tax=" + tax + ", License Fee=" + licenseFee +
               ", Total Price=" + totalPrice + "]";
    }
}
