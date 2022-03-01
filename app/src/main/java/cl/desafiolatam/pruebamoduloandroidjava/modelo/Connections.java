package cl.desafiolatam.pruebamoduloandroidjava.modelo;

import com.google.gson.annotations.SerializedName;

public class Connections {

    @SerializedName("groupAffiliation")
    private String groupAffiliation;

    @SerializedName("relatives")
    private String relatives;

    public void setGroupAffiliation(String groupAffiliation){
        this.groupAffiliation = groupAffiliation;
    }

    public String getGroupAffiliation(){
        return groupAffiliation;
    }

    public void setRelatives(String relatives){
        this.relatives = relatives;
    }

    public String getRelatives(){
        return relatives;
    }

    @Override
    public String toString(){
        return
                "Connections{" +
                        "groupAffiliation = '" + groupAffiliation + '\'' +
                        ",relatives = '" + relatives + '\'' +
                        "}";
    }

}
