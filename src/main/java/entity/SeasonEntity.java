package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SeasonEntity {

    @Id
    private int year;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "SeasonEntity{" +
                "year=" + year +
                '}';
    }
}
