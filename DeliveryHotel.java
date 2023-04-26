import java.util.ArrayList;

public class DeliveryHotel {
    private String            name;
    private ArrayList<String> lodgingList;
    private String            deliveryTime;
    private float             customerCost;
    private String            mapCoordinates;
    private GeographicalArea  area;

    // constructor
    public DeliveryHotel(String name){
        this.name      = name;
        lodgingList    = new ArrayList<>();
        deliveryTime   = "";
        customerCost   = 0;
        mapCoordinates = "";

        area           = new GeographicalArea("");
    }

    // getters
    public String            getName()           { return name;           }
    public ArrayList<String> getLodgingList()    { return lodgingList;    }
    public String            getDeliveryTime()   { return deliveryTime;   }
    public float             getCustomerCost()   { return customerCost;   }
    public String            getMapCoordinates() { return mapCoordinates; }

    public GeographicalArea  getArea()           { return area;           }

    // setters
    public void setName(          String            name)  { this.name           = name;  }
    public void setLodgingList(   ArrayList<String> list)  { this.lodgingList    = list;  }
    public void setDeliveryTime(  String            time)  { this.deliveryTime   = time;  }
    public void setCustomerCost(  float             price) { this.customerCost   = price; }
    public void setMapCoordinates(String            coord) { this.mapCoordinates = coord; }

    public void setArea(          GeographicalArea  area)  { this.area           = area;  }

    // other methods
    public void addLodgingElem(String el) { this.lodgingList.add(el); }
    public void clearLodgingList()        { this.lodgingList.clear(); }
    public void showLodgingList()         {System.out.println(this.lodgingList);}
}
