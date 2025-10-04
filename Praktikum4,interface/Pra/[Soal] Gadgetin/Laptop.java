class Laptop implements IDesktop {
  private String brand;
  private String model;
  private double price;
  private boolean isOn;
  private String operatingSystem;

  /* Konstruktor */
  public Laptop(String brand, String model, double price, String operatingSystem) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.operatingSystem = operatingSystem;
    this.isOn = false;
    System.out.println("Laptop " + brand + " " + model + " created.");
  }
      @Override
    public void turnOn() {
        isOn = true;
        System.out.println(brand + " " + model + " is now ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(brand + " " + model + " is now OFF");
    }

    @Override
    public String getInfo() {
        return (isOn ? "[ON] " : "[OFF] ") + brand + " " + model + " - Rp" + price +
               " - OS: " + operatingSystem;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public void installSoftware(String softwareName) {
      System.out.println("Installing " + softwareName + " on " + brand + " " + model);
    }
    @Override
    public void openApplication(String appName) {
      System.out.println("Opening " + appName + " on " + brand + " " + model);
    }
    @Override
    public String getOperatingSystem() {
      return operatingSystem;
    }

}