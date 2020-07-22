package com.ubuntu.brasil.animais.felino;

import com.ubuntu.brasil.animais.AnimaisTerrestres;

abstract class Felino extends AnimaisTerrestres {
    private boolean bigode;
    private String patas;
    private String corDoPelo;

    public Felino(boolean viveNaAgua, boolean pelo, String peso, String nicho, boolean bigode, String patas, String corDoPelo) {
        super(viveNaAgua, pelo, peso, nicho);
        this.bigode = bigode;
        this.patas = patas;
        this.corDoPelo = corDoPelo;
    }

    public Felino(){

    }

    public boolean isBigode() {
        return bigode;
    }

    public void setBigode(boolean bigode) {
        this.bigode = bigode;
    }

    public String getPatas() {
        return patas;
    }

    public void setPatas(String patas) {
        this.patas = patas;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
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
        System.out.println("Som do felino");

    }

    public void faroAgucado(){
        System.out.println("Os felinos possuem faro aguçado!");
    }

}
