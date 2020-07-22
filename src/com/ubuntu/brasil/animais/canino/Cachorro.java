package com.ubuntu.brasil.animais.canino;


public class Cachorro extends Canino {
    private String raca;

    public Cachorro(boolean viveNaAgua, boolean pelo, String peso, String nicho, String tipo, String raca) {
        super(viveNaAgua, pelo, peso, nicho, tipo);
        this.raca = raca;
    }
    public Cachorro(){

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
    public void emiteSom(){
        System.out.println("Au, au, au");
    }

    @Override
    public void rosnar() {

    }

    public void pegaBolinha(){
        System.out.println("Cachorros adoram buscar bolinha");

    }

    public void fazBagunca(){
        System.out.println("Cachorros fazem muita bagunça!");
    }
    public void reagir(String frase){
        if(frase == "Vem comer, Lua!"){
            System.out.println("Abana o rabinho");
        }else {
            System.out.println("Latir");
        }
    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Pegar a bolinha");
        }
        else{
            System.out.println("Permanece deitado na caminha");
        }

    }
}

