package com.ubuntu.brasil.animais.felino;

import com.ubuntu.brasil.animais.felino.Felino;

public class Leoa extends Felino {
    private boolean feroz;

    public Leoa(boolean viveNaAgua, boolean pelo, String peso, String nicho, boolean bigode, String patas, String corDoPelo, boolean feroz) {
        super(viveNaAgua, pelo, peso, nicho, bigode, patas, corDoPelo);
        this.feroz = feroz;
    }
    public Leoa(){

    }

    public boolean isFeroz() {
        return feroz;
    }

    public void setFeroz(boolean feroz) {
        this.feroz = feroz;
    }

    @Override
    public void come() {
        super.come();
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
    public void faroAgucado() {

    }

    public void cercaAnimais(){
        System.out.println("A leoa é uma boa caçadora!");
    }
}
