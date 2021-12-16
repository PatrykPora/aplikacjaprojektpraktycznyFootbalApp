package model;


import entity.LogosEntity;

public class League {

    private String id;
    private String name;
    private String slug;
    private String abbr;
    private Logos logos;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public Logos getLogos() {
        return logos;
    }

    public void setLogos(Logos logos) {
        this.logos = logos;
    }

    @Override
    public String toString() {
        return "League{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", abbr='" + abbr + '\'' +
                ", logos=" + logos +
                '}';
    }
}