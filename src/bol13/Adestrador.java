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
public class Adestrador extends Seleccion {

    private int idFederacion;

    public Adestrador() {
    }

    public Adestrador(int id, String nome, String apelido, int edade, int idFederacion) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirixiPartido() {
        System.out.println("Dirixen o partido: " + toString() + idFederacion);
    }

    public void dirixirAdestramento() {
        System.out.println("Dirixen o adestramento: " + toString() + idFederacion);
    }

    @Override
    public String toString() {
        return  toString()+" idFederacion = " + idFederacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os adestradores");
    }
}
