
package Part1Examples;

import java.io.Serializable;


public class Product implements Serializable {
    private String description;
    private double price;
    private int units;

    public Product(String description, double price, int units) {
        this.description = description;
        this.price = price;
        this.units = units;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", price=" + price + ", units=" + units + '}';
    }
    
    
    
}
