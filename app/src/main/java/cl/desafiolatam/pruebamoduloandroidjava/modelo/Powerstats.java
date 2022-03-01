package cl.desafiolatam.pruebamoduloandroidjava.modelo;

import com.google.gson.annotations.SerializedName;

public class Powerstats {

    @SerializedName("strength")
    private int strength;

    @SerializedName("durability")
    private int durability;

    @SerializedName("combat")
    private int combat;

    @SerializedName("power")
    private int power;

    @SerializedName("speed")
    private int speed;

    @SerializedName("intelligence")
    private int intelligence;

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void setCombat(int combat) {
        this.combat = combat;
    }

    public int getCombat() {
        return combat;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        return
                "Powerstats{" +
                        "strength = '" + strength + '\'' +
                        ",durability = '" + durability + '\'' +
                        ",combat = '" + combat + '\'' +
                        ",power = '" + power + '\'' +
                        ",speed = '" + speed + '\'' +
                        ",intelligence = '" + intelligence + '\'' +
                        "}";
    }

}
