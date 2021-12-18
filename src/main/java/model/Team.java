package model;

import entity.StandingEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Team {

    @Id
    private String name;
    private int year;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}