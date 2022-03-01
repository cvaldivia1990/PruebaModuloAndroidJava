package cl.desafiolatam.pruebamoduloandroidjava.modelo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Biography {


    @SerializedName("firstAppearance")
    private String firstAppearance;

    @SerializedName("placeOfBirth")
    private String placeOfBirth;

    @SerializedName("aliases")
    private List<String> aliases;

    @SerializedName("fullName")
    private String fullName;

    @SerializedName("publisher")
    private String publisher;

    @SerializedName("alterEgos")
    private String alterEgos;

    @SerializedName("alignment")
    private String alignment;

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAlterEgos(String alterEgos) {
        this.alterEgos = alterEgos;
    }

    public String getAlterEgos() {
        return alterEgos;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getAlignment() {
        return alignment;
    }

    @Override
    public String toString() {
        return
                "Biography{" +
                        "firstAppearance = '" + firstAppearance + '\'' +
                        ",placeOfBirth = '" + placeOfBirth + '\'' +
                        ",aliases = '" + aliases + '\'' +
                        ",fullName = '" + fullName + '\'' +
                        ",publisher = '" + publisher + '\'' +
                        ",alterEgos = '" + alterEgos + '\'' +
                        ",alignment = '" + alignment + '\'' +
                        "}";
    }

}
