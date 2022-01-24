public class Heart {
    // PROPERTIES
    private String color;
    //Add remaining heart properties here...

    private String size;

    private String sayings;

    private String calories;

    private String costPerPound;

    private String available;

    private String stock;



    // CONSTRUCTORS
    public Heart() {} // This is the default contructor
    //Add overloaded Constructor here...




    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    //Add remaining Accessor methods here...
    public String getSize() {
        return this.size;
    }

    public String getSayings() {
        return this.sayings;
    }

    public String getCalories() {
        return this.calories;
    }

    public String getCostPerPound() {
        return this.costPerPound;
    }

    public String getAvailable() {
        return this.available;
    }

    public String getStock() {
        return this.stock;
    }




    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    //Add remaining Mutator methods here...

    public void setSize(String size) {
        this.size = size;
    }

    public void setSayings(String sayings) {
        this.sayings = sayings;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public void setCostPerPound(String costPerPound) {
        this.costPerPound = costPerPound;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }


    // METHODS
    public String report() {
        return this.color + "\n"; // Add other properties here as you add them to the class
    }
    //Write other methods here (if needed)...
}
