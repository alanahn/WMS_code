package W13;

// 재료
public class Ingredient {
    private String name;
    private String quantity;

    public Ingredient(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    
    public String toString() {
        return quantity + " " + name;
    }
    
}
