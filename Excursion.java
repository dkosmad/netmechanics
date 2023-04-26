import java.util.ArrayList;

public class Excursion {
    private String  description   ;
    private String  title         ;
    private String  excursProgram ;
    private String  code          ;
    private boolean isActive      ;

    // Links to other classes
    private ArrayList<DepartProgramElem> departProgramList  ;
    private PricePolicy                  pricePolicy        ;
    private ArrayList<AdditionalService> additionalServices ;
    private ArrayList<TourGuideProgram>  tourGuideList      ;

    // constructor
    public Excursion(String code){
        description   = ""  ;
        title         = ""  ;
        excursProgram = ""  ;
        this.code     = code;
        isActive      = true;

        departProgramList  = new ArrayList<DepartProgramElem>();
        pricePolicy        = new PricePolicy();
        additionalServices = new ArrayList<AdditionalService>();
        tourGuideList      = new ArrayList<TourGuideProgram>();
    }

    // getters
    public String  getDescription()   { return description;   }
    public String  getTitle()         { return title;         }
    public String  getExcursProgram() { return excursProgram; }
    public String  getCode()          { return code;          }
    public boolean isActive()         { return isActive;      }

    public ArrayList<DepartProgramElem> getDepartProgramList()  { return departProgramList;  }
    public PricePolicy                  getPricePolicy()        { return pricePolicy;        }
    public ArrayList<AdditionalService> getAdditionalServices() { return additionalServices; }
    public ArrayList<TourGuideProgram>  getTourGuideList()      { return tourGuideList;      }

    // setters
    public void setDescription( String  text) { this.description   = text; }
    public void setTitle(       String  text) { this.title         = text; }
    public void setExcursProgram(String text) { this.excursProgram = text; }
    public void setCode(         String text) { this.code          = text; }
    public void setActive(       boolean b  ) { this.isActive      = b;    }

    public void setDepartProgramList( ArrayList<DepartProgramElem> list) { this.departProgramList  = list; }
    public void setPricePolicy(       PricePolicy                  text) { this.pricePolicy        = text; }
    public void setAdditionalServices(ArrayList<AdditionalService> list) { this.additionalServices = list; }
    public void setTourGuideList(     ArrayList<TourGuideProgram>  list) { this.tourGuideList      = list; }

    // other methods
    public void addDepartProgramElem(DepartProgramElem el) { this.departProgramList.add(el); }
    public void clearDepartProgram()                       { this.departProgramList.clear(); }
    public void showDepartProgram()                        {System.out.println(this.departProgramList);}

    public void addAdditionalService(AdditionalService s) { this.additionalServices.add(s); }
    public void clearAdditionalServices()                 { this.additionalServices.clear(); }
    public void showAdditionalServices()                  {System.out.println(this.additionalServices);}

    public void addTourGuideElem(TourGuideProgram el) { this.tourGuideList.add(el); }
    public void clearTourGuideList()                  { this.tourGuideList.clear(); }
    public void showTourGuideList()                   { System.out.println(this.tourGuideList);}
}
