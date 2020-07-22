package com.ubuntu.brasil.animais.canino;

public class Lobo extends Canino{
    private String corDoOlho;

    public Lobo(boolean viveNaAgua, boolean pelo, String peso, String nicho, String tipo, String corDoOlho) {
        super(viveNaAgua, pelo, peso, nicho, tipo);
        this.corDoOlho = corDoOlho;
    }

    public String getCorDoOlho() {
        return corDoOlho;
    }

    public void setCorDoOlho(String corDoOlho) {
        this.corDoOlho = corDoOlho;
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
    public void rosnar() {

    }

    public void pegaAnimais(){
        System.out.println("Lobo é um bom caçador!");
    }
}
