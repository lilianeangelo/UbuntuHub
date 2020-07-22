package com.ubuntu.brasil.animais.canino;

import com.ubuntu.brasil.animais.AnimaisTerrestres;

public abstract class Canino extends AnimaisTerrestres {
    private String tipo;

    public Canino(boolean viveNaAgua, boolean pelo, String peso, String nicho, String tipo) {
        super(viveNaAgua, pelo, peso, nicho);
        this.tipo = tipo;
    }

    public Canino(){

    }

    @Override
    public void come() {

    }

    @Override
    public void movimenta() {

    }

    @Override
    public void respira() {

    }

    @Override
    public void emiteSom() {
        System.out.println("Som de canino");

    }
    public abstract void rosnar();

}