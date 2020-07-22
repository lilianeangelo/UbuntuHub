package com.ubuntu.brasil;

import com.ubuntu.brasil.animais.AnimaisTerrestres;
import com.ubuntu.brasil.animais.canino.Cachorro;
import com.ubuntu.brasil.animais.canino.Lobo;
import com.ubuntu.brasil.animais.felino.Felino;
import com.ubuntu.brasil.animais.felino.Gato;
import com.ubuntu.brasil.animais.felino.Leoa;
import revisao.Bairro;
import revisao.CondominioFechado;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //AULA 2

        Bairro bairro = new Bairro();
        bairro.abrirPorta();

        CondominioFechado fechado = new CondominioFechado();
        fechado.cortar(true);




//        List<AnimaisTerrestres> animaisTerrestres = new ArrayList<>();
//
//        Cachorro cachorro = new Cachorro();
        //Aula 03- Sobrecarga
        //cachorro.reagir();


        //Gato gato = new Gato();
        //Aula 03 - Sobreposição
        //Cachorro c = new Cachorro();
        //cachorro.emiteSom();
        //Felino felino = new Felino();
        //felino.emiteSom();
        //Lobo lobo = new Lobo();

        //Leoa leoa = new Leoa();
    }
}
