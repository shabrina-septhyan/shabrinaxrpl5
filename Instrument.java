package instrument;
public class Instrument {
    private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  Instrument() {
        type = "null";
        price = 0;

    }
    // Constructor Parameter
    public Instrument(String i, double p) {
    type  = i;
    price = p;
    }

        public void print () {
            System.out.println ("Masukan tipe: "+type);
            System.out.println ( "Masukan harga: " +price);
        }
}
    

