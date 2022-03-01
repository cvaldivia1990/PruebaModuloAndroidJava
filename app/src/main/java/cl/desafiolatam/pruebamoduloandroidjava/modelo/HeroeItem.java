package cl.desafiolatam.pruebamoduloandroidjava.modelo;

import com.google.gson.annotations.SerializedName;

public class HeroeItem {

    @SerializedName("images")
    private Images images;

    @SerializedName("appearance")
    private Appearance appearance;

    @SerializedName("work")
    private Work work;

    @SerializedName("name")
    private String name;

    @SerializedName("powerstats")
    private Powerstats powerstats;

    @SerializedName("id")
    private int id;

    @SerializedName("biography")
    private Biography biography;

    @SerializedName("slug")
    private String slug;

    @SerializedName("connections")
    private Connections connections;

    public void setImages(Images images) {
        this.images = images;
    }

    public Images getImages() {
        return images;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Work getWork() {
        return work;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPowerstats(Powerstats powerstats) {
        this.powerstats = powerstats;
    }

    public Powerstats getPowerstats() {
        return powerstats;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }

    public Biography getBiography() {
        return biography;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSlug() {
        return slug;
    }

    public void setConnections(Connections connections) {
        this.connections = connections;
    }

    public Connections getConnections() {
        return connections;
    }

    @Override
    public String toString() {
        return
                "HeroeItem{" +
                        "images = '" + images + '\'' +
                        ",appearance = '" + appearance + '\'' +
                        ",work = '" + work + '\'' +
                        ",name = '" + name + '\'' +
                        ",powerstats = '" + powerstats + '\'' +
                        ",id = '" + id + '\'' +
                        ",biography = '" + biography + '\'' +
                        ",slug = '" + slug + '\'' +
                        ",connections = '" + connections + '\'' +
                        "}";
    }

}
