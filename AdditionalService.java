public class AdditionalService {
    private String description ;
    private float  price       ;

    // constructor
    public AdditionalService() {
        description = "";
        price       = 0 ;
    }

    // getters
    public String getDescription() { return description; }
    public float  getPrice()       { return price;       }

    // setters
    public void setDescription(String text)  { this.description = text;  }
    public void setPrice(      float  price) { this.price       = price; }
}
