package com.ubuntu.brasil.animais;

public abstract class AnimaisTerrestres {
    private boolean patas;
    private boolean pelo;
    private String peso;
    private String nicho;

    public AnimaisTerrestres(boolean patas, boolean pelo, String peso, String nicho) {
        this.patas = patas;
        this.pelo = pelo;
        this.peso = peso;
        this.nicho = nicho;
    }

    public AnimaisTerrestres() {

    }

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public boolean isPelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    public abstract void buscaComida();

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
