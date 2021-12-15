package mapper;

import entity.LogosEntity;
import model.Logos;

public class LogosMapper {

    public static Logos mapLogosEntityToLogos(LogosEntity logosEntity) {
        Logos logos = new Logos();

        logos.setDark(logosEntity.getDark());
        logos.setLight(logosEntity.getLight());
        return logos;
    }

    public static LogosEntity mapLogosToLogosEntity(Logos logos) {
        LogosEntity logosEntity = new LogosEntity();

        logosEntity.setDark(logos.getDark());
        logosEntity.setLight(logos.getLight());

        return logosEntity;
    }
}
