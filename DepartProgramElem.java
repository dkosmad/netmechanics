public class DepartProgramElem {
    private String monthName          ;
    private String departDaysOfWeek   ;
    private String departTimeFromHer  ;
    private String departTimeFromDest ;

    // constructor
    public DepartProgramElem() {
        monthName          = "";
        departDaysOfWeek   = "";
        departTimeFromHer  = "";
        departTimeFromDest = "";
    }

    // getters
    public String getDepartDaysOfWeek()   { return this.departDaysOfWeek;   }
    public String getMonthName()          { return this.monthName;          }
    public String getDepartTimeFromHer()  { return this.departTimeFromHer;  }
    public String getDepartTimeFromDest() { return this.departTimeFromDest; }

    // setters
    public void setMonthName(         String month) { this.monthName          = month; }
    public void setDepartDaysOfWeek(  String days)  { this.departDaysOfWeek   = days;  }
    public void setDepartTimeFromHer( String time)  { this.departTimeFromHer  = time;  }
    public void setDepartTimeFromDest(String time)  { this.departTimeFromDest = time;  }
}
