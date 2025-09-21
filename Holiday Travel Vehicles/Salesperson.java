public class Salesperson {
    private int salespersonID;
    private String name;
    private String phone;

    public Salesperson(int salespersonID, String name, String phone) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.phone = phone;
    }

    public int getSalespersonID() { return salespersonID; }
    public String getName() { return name; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return "Salesperson [ID=" + salespersonID + ", Name=" + name +
               ", Phone=" + phone + "]";
    }
}
