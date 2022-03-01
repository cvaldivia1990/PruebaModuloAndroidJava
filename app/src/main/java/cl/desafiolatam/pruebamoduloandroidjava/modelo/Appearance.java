package cl.desafiolatam.pruebamoduloandroidjava.modelo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Appearance {

    @SerializedName("gender")
    private String gender;

    @SerializedName("race")
    private String race;

    @SerializedName("eyeColor")
    private String eyeColor;

    @SerializedName("weight")
    private List<String> weight;

    @SerializedName("hairColor")
    private String hairColor;

    @SerializedName("height")
    private List<String> height;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setWeight(List<String> weight) {
        this.weight = weight;
    }

    public List<String> getWeight() {
        return weight;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHeight(List<String> height) {
        this.height = height;
    }

    public List<String> getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return
                "Appearance{" +
                        "Gender = '" + gender + '\'' +
                        ",race = '" + race + '\'' +
                        ",eyeColor = '" + eyeColor + '\'' +
                        ",weight = '" + weight + '\'' +
                        ",hairColor = '" + hairColor + '\'' +
                        ",height = '" + height + '\'' +
                        "}";
    }

}
