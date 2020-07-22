package com.ubuntu.brasil.animais.canino;


public class Cachorro extends Canino {
    private String raca;

    public Cachorro(boolean viveNaAgua, boolean pelo, String peso, String nicho, String tipo, String raca) {
        super(viveNaAgua, pelo, peso, nicho, tipo);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void movimenta() {
        super.movimenta();
    }

    @Override
    public void respira() {
        super.respira();
    }

    @Override
    public void emiteSom() {
        super.emiteSom();
    }

    @Override
    public void rosnar() {

    }

    public void pegaBolinha(){

    }

    public void latir(){

    }
}

