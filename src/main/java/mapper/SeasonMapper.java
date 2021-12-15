package mapper;

import entity.SeasonEntity;
import model.Season;

public class SeasonMapper {

    public static Season mapSeasonEntityToSeason(SeasonEntity seasonEntity) {
        Season season = new Season();

        season.setYear(seasonEntity.getYear());

        return season;
    }


    public static SeasonEntity mapSeasonToSeasonEntity(Season season) {
        SeasonEntity seasonEntity = new SeasonEntity();

        seasonEntity.setYear(season.getYear());

        return seasonEntity;

    }
}
