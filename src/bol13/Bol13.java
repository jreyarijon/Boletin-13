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
public class Bol13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Xogador xg = new Xogador(11, "Pedro", "Perez", 28, 5, "delantero");
        Adestrador ad = new Adestrador(111, "Javier", "Martinez", 34, 1211);
        Masaxista mx = new Masaxista(222, "Diego", "Ramirez", 36, "Titulo mesaxes", 10);
        Seleccion sl = new Seleccion(1, "nomeSeleccion", null, 0);

        Seleccion slxg = new Xogador();

        xg.concentrarse();
        ad.concentrarse();
        mx.concentrarse();
        slxg.concentrarse();

        xg.viaxar();
        ad.viaxar();
        mx.viaxar();
        sl.viaxar();
        slxg.viaxar();


    }

}
