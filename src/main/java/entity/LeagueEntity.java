package entity;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeagueEntity {

    @Id
    private String id;

    private String name;
    private String slug;
    private String abbr;

    @Embedded
    private LogosEntity logosEntity;

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

    public LogosEntity getLogosEntity() {
        return logosEntity;
    }

    public void setLogosEntity(LogosEntity logosEntity) {
        this.logosEntity = logosEntity;
    }

    @Override
    public String toString() {
        return "LeagueEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", abbr='" + abbr + '\'' +
                ", logosEntity=" + logosEntity +
                '}';
    }
}
