public class Mage implements MagicalAttack, StrengthComparable {
    // TODO: Buat atribut private String name, int magicalPower
    private String name;
    private int magicalPower;
    // TODO: Buat constructor yang menerima name dan magicalPower
    // Set kedua atribut dengan parameter yang diterima
    public Mage (String name, int magicalPower){
        this.name = name;
        this.magicalPower = magicalPower;
    }    
    // TODO: Override method performAttack()
    // Tampilkan: "<name> melancarkan sihir dahsyat! memberikan <magicalPower> damage sihir!"
    @Override
    public void performAttack(){
        System.out.println( this.name + " melancarkan sihir dahsyat! memberikan " + this.magicalPower + " damage sihir!");
    }
    // TODO: Override method getMagicalPower()
    // Buat getter untuk magicalPower
    @Override
    public int getMagicalPower(){
        return magicalPower;
    }
    
    // TODO: Override method setMagicalPower(int power)
    // Buat setter untuk magicalPower
    @Override
    public void setMagicalPower(int power){
        this.magicalPower = power;
    }
    // TODO: Override method compareStrength(StrengthComparable other)
    // Jika other adalah instance dari Mage:
    //   - Bandingkan magicalPower:
    //     - Jika this.magicalPower < other.magicalPower, return -1
    //     - Jika this.magicalPower == other.magicalPower, return 0
    //     - Jika this.magicalPower > other.magicalPower, return 1
    // Jika other bukan instance dari Mage, return -2

    @Override
    public int compareStrength(StrengthComparable other) {
        if (!(other instanceof Mage)) {
            return -2;
        }
        Mage M = (Mage) other;
        return Integer.compare(this.magicalPower, M.magicalPower);
    }
    
}