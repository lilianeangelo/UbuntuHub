package com.ubuntu.brasil;

import com.ubuntu.brasil.animais.AnimaisTerrestres;
import com.ubuntu.brasil.animais.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //AULA 2
        List<AnimaisTerrestres> animaisTerrestres = new ArrayList<>();

        Cachorro cachorro = new Cachorro();
        cachorro.setPatas(true);
        cachorro.setPelo(true);
        cachorro.setNicho("O nicho do animal terrestre é:"+" "+ "canino");
        cachorro.setTipo("cachorro");

        System.out.println(cachorro.getTipo());
        System.out.println(cachorro.getNicho());




//        Pessoa primeiraPessoa = new Pessoa();
//        primeiraPessoa.setCpf("CPF:"+" "+"58492568436");
//        primeiraPessoa.setDataNascimento("Data de Nascimento:"+" "+"08/09/2010");
//        primeiraPessoa.setNome("Nome:"+" "+"Luiz Henrique");
//        System.out.println(primeiraPessoa.getNome());
//        System.out.println(primeiraPessoa.getCpf());
//        System.out.println(primeiraPessoa.getDataNascimento());
//
//        Conta contaDoLuiz = new Conta();
//        contaDoLuiz.setSaldo(896.69);
//        contaDoLuiz.deposita(200);
//        System.out.println("O saldo da conta do Luiz Henrique é de:");
//        System.out.println(contaDoLuiz.getSaldo());

        //public void procuraComida();


        //public void fazBagunca();
        //public void latir();




    }
}
