package ro.unibuc.pao.grila;

import java.util.Objects;

public class Automobil {

    private String marca;

    private String model;

    private Integer capacitate;

    private Integer pret;

    public Automobil(String marca, String model, Integer capacitate, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.capacitate = capacitate;
        this.pret = pret;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(Integer capacitate) {
        this.capacitate = capacitate;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Automobil)) {
            return false;
        }
        Automobil automobil = (Automobil) o;
        return Objects.equals(getMarca(), automobil.getMarca()) && Objects.equals(getModel(), automobil.getModel()) && Objects.equals(getCapacitate(), automobil.getCapacitate()) && Objects.equals(getPret(), automobil.getPret());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca(), getModel(), getCapacitate(), getPret());
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", capacitate=" + capacitate +
                ", pret=" + pret +
                '}';
    }
}
