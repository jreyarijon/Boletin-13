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
public class Masaxista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(int id, String nome, String apelido, int edade, String titulacion, int anosExperiencia) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaxes() {
        System.out.println("O masaxista" + toString() + "con: " + titulacion + " " + anosExperiencia + " atende a" + toString());
    }

    @Override
    public String toString() {
        return super.toString()+ " titulacion="  + titulacion + ", anosExperiencia=" + anosExperiencia;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os masaxistas");
    }
}
