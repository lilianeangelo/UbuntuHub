package com.ubuntu.brasil.animais.felino;

public class Gato extends Felino {
    public boolean domestico;

    public Gato(boolean viveNaAgua, boolean pelo, String peso, String nicho, boolean bigode, String patas, String corDoPelo, boolean domestico) {
        super(viveNaAgua, pelo, peso, nicho, bigode, patas, corDoPelo);
        this.domestico = domestico;
    }

    public Gato(){

    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
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

    public void sabeRonronar(){
        System.out.println("Gato sabe ronronar!");
    }
}
