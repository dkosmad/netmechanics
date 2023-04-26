public class PricePolicy {
    private float  adultPrice             ;
    private float  childFrom2To11yrsPrice ;
    private float  babyPrice              ;
    private String shortDescription       ;

    // constructor
    public PricePolicy() {
        adultPrice             =  0 ;
        childFrom2To11yrsPrice =  0 ;
        babyPrice              =  0 ;
        shortDescription       =  "";
    }

    // getters
    public float  getAdultPrice()             { return adultPrice;             }
    public float  getChildFrom2To11yrsPrice() { return childFrom2To11yrsPrice; }
    public float  getBabyPrice()              { return babyPrice;              }
    public String getShortDescription()       { return shortDescription;       }

    // setters
    public void setAdultPrice(            float  price) { this.adultPrice             = price; }
    public void setChildFrom2To11yrsPrice(float  price) { this.childFrom2To11yrsPrice = price; }
    public void setBabyPrice(             float  price) { this.babyPrice              = price; }
    public void setShortDescription(      String descr) { this.shortDescription       = descr; }
}
