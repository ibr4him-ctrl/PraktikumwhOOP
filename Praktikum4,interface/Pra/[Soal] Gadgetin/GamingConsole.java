class GamingConsole implements IGadget {
  private String brand;
  private String model;
  private double price;
  private boolean isOn;

  /* Konstruktor */
  public GamingConsole(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.isOn = false;
    System.out.println("Gaming Console " + brand + " " + model + " created.");
  }


  // Gaming Console specific method
  /**
   * Memainkan game pada konsol
   * Menampilkan pesan "Playing [gameName] on [brand] [model]"
   * 
   * @param gameName
   */
  public void playGame(String gameName) {
    System.out.println("Playing " +gameName+ " on " +brand+ " " +model);
  }

  @Override
  public void turnOn(){
      isOn = true;
      System.out.println(brand + " " + model + " is now ON");
    }

  /**
   * Mematikan gadget
   * 
   * Mengubah status isOn menjadi false
   * 
   * Menampilkan pesan "[brand] [model] is now OFF"
   */
  @Override
  public void turnOff(){
    isOn = false;
    System.out.println(brand + " " + model + " is now OFF");
  }


  /**
   * Mendapatkan informasi gadget
   * 
   * Jika gadget menyala, mengembalikan string dalam format:
   * "[ON] [brand] [model] - Rp [price]"
   * 
   * Jika gadget mati, mengembalikan string dalam format:
   * "[OFF] [brand] [model] - Rp [price]"
   */
  @Override
  public String getInfo(){
    if (isOn){
      return "[ON] " + brand + " " + model + " - Rp"+ price;
    } else {
      return "[OFF] " + brand + " " + model + " - Rp"+ price;
    }
  }

  /**
   * Mendapatkan harga gadget
   * 
   * @return harga gadget
   */
  public double getPrice(){
    return price;
  }

  /**
   * Mendapatkan merek gadget
   * 
   * @return merek gadget
   */
  public String getBrand(){
    return brand;
  }
}
