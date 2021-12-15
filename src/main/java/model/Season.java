package model;

public class Season {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Season{" +
                "year=" + year +
                '}';
    }
}
