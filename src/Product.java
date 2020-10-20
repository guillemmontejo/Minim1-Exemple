public class Product {
    private String name, description;
    private double prize;
    private int numSales;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumSales() {
        return numSales;
    }

    public void setNumSales(int numSales) {
        this.numSales = numSales;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public double getPrize() {
        return prize;
    }

    public Product(String name, String description, double prize) {
        this.name = name;
        this.description = description;
        this.prize = prize;
        this.numSales = 0;
    }

    @Override
    public String toString() {
        return this.name+" "+this.description+" "+this.prize;
    }
}
