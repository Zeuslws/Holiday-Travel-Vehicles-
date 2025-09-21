public class NewVehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public NewVehicle(String serialNumber, String name, String model,
                      int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getSerialNumber() { return serialNumber; }
    public String getName() { return name; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getManufacturer() { return manufacturer; }
    public double getBaseCost() { return baseCost; }

    @Override
    public String toString() {
        return "serialNumber: " + serialNumber + "\n" +
           "name: " + name + "\n" +
           "model: " + model + "\n" +
           "year: " + year + "\n" +
           "manufacturer: " + manufacturer + "\n" +
           "baseCost: " + baseCost;
}

}


