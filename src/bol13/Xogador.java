/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol13;

/**
 *
 * @author Josemolamazo
 */
public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void xogarPartido() {
        System.out.println("Xogan un partido el dorsal " + dorsal + " en posicion de " + demarcacion);
    }

    public void entrenar() {
        System.out.println("Entrenan para un partido el dorsal " + dorsal + " practicando la posición " + demarcacion);
    }

    @Override
    public String toString() {
        return toString()+ "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o xogador");
    }

}
