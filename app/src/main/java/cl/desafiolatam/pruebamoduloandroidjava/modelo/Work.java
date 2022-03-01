package cl.desafiolatam.pruebamoduloandroidjava.modelo;

import com.google.gson.annotations.SerializedName;

public class Work {

    @SerializedName("occupation")
    private String occupation;

    @SerializedName("base")
    private String base;

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getBase() {
        return base;
    }

    @Override
    public String toString() {
        return
                "Work{" +
                        "occupation = '" + occupation + '\'' +
                        ",base = '" + base + '\'' +
                        "}";
    }

}
