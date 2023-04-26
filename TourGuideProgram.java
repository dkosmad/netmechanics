public class TourGuideProgram {
    private String language  ;
    private String daysOfWeek;

    // constructor
    public TourGuideProgram() {
        language   = "";
        daysOfWeek = "";
    }
    // getters
    public String getLanguage()   { return language;   }
    public String getDaysOfWeek() { return daysOfWeek; }

    // setters
    public void setLanguage(  String text) { this.language   = text; }
    public void setDaysOfWeek(String text) { this.daysOfWeek = text; }
}
