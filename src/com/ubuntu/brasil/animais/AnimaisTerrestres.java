package com.ubuntu.brasil.animais;

public abstract class AnimaisTerrestres {
    protected boolean viveNaAgua; //nadar
    protected boolean pelo;
    protected String peso;
    protected String nicho;

    public AnimaisTerrestres(boolean viveNaAgua, boolean pelo, String peso, String nicho) {
        this.viveNaAgua = viveNaAgua;
        this.pelo = pelo;
        this.peso = peso;
        this.nicho = nicho;
    }

    public AnimaisTerrestres() {

    }

    public boolean isViveNaAgua() {
        return viveNaAgua;
    }

    public void setViveNaAgua(boolean viveNaAgua) {
        this.viveNaAgua = viveNaAgua;
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
// Aula 3 - Polimorfismo de sobreposição

    public abstract void come();

    public abstract void movimenta();

    public abstract void respira();

    public abstract void emiteSom();
}
