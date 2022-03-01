package cl.desafiolatam.pruebamoduloandroidjava.modelo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Heroe {

    @SerializedName("Heroe")
    private List<HeroeItem> heroe;

    public void setHeroe(List<HeroeItem> heroe){
        this.heroe = heroe;
    }

    public List<HeroeItem> getHeroe(){
        return heroe;
    }

    @Override
    public String toString(){
        return
                "Heroe{" +
                        "heroe = '" + heroe + '\'' +
                        "}";
    }

}
