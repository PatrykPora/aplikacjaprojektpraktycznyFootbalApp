package model;

public class Logos {

    private String light;
    private String dark;

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getDark() {
        return dark;
    }

    public void setDark(String dark) {
        this.dark = dark;
    }

    @Override
    public String toString() {
        return "Logos{" +
                "light='" + light + '\'' +
                ", dark='" + dark + '\'' +
                '}';
    }
}