public class Newspaper {
    String name;
    int year;
    int month;
    int dayOfMonth;
    boolean isFinnish;

    public Newspaper(String name, int year, int month, int dayOfMonth, boolean isFinnish) {


    }

    String getName ()
    {
        return name;
    }

    void setDate (int year,int month,int DayOfMonth)
    {
        this.year = year;
        this.month = month;
        this.dayOfMonth = DayOfMonth;
    }

    boolean getIsFinnish() {
        return isFinnish;
    }

    public  String toString() {
        return name + ", " + year + "." + month + "." + dayOfMonth + " " + isFinnish;
    }

}
