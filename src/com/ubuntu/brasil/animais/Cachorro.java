package com.ubuntu.brasil.animais;

public class Cachorro extends Canino {

    public Cachorro(boolean patas, boolean pelo, String peso, String nicho, String tipo) {
        super(patas, pelo, peso, nicho, tipo);
    }

    public Cachorro() {
        super();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public void fazBarulho() {

    }

    public Cachorro(boolean patas, boolean pelo, String peso, String nicho) {
        super(patas, pelo, peso, nicho);
    }

    @Override
    public boolean isPatas() {
        return super.isPatas();
    }

    @Override
    public void setPatas(boolean patas) {
        super.setPatas(patas);
    }

    @Override
    public boolean isPelo() {
        return super.isPelo();
    }

    @Override
    public void setPelo(boolean pelo) {
        super.setPelo(pelo);
    }

    @Override
    public String getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(String peso) {
        super.setPeso(peso);
    }

    @Override
    public String getNicho() {
        return super.getNicho();
    }

    @Override
    public void setNicho(String nicho) {
        super.setNicho(nicho);
    }

    @Override
    public void buscaComida() {
        super.buscaComida();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
