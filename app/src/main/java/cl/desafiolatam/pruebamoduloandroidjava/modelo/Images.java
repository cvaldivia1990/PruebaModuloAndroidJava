package cl.desafiolatam.pruebamoduloandroidjava.modelo;

import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("md")
    private String md;

    @SerializedName("sm")
    private String sm;

    @SerializedName("xs")
    private String xs;

    @SerializedName("lg")
    private String lg;

    public void setMd(String md) {
        this.md = md;
    }

    public String getMd() {
        return md;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public String getSm() {
        return sm;
    }

    public void setXs(String xs) {
        this.xs = xs;
    }

    public String getXs() {
        return xs;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public String getLg() {
        return lg;
    }

    @Override
    public String toString() {
        return
                "Images{" +
                        "md = '" + md + '\'' +
                        ",sm = '" + sm + '\'' +
                        ",xs = '" + xs + '\'' +
                        ",lg = '" + lg + '\'' +
                        "}";
    }

}
