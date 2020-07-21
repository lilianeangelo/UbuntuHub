package com.ubuntu.brasil.Pessoa;

public class Conta {
    private String agencia;
    private String numeroConta;
    private Double saldo;

    public Conta(String agencia, String numeroConta, Double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Conta(){

    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //Aula 2 - Criando método
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
}
