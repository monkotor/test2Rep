/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet;

/**
 *
 * @author B
 */
public class Klasa {
    int liczba;
    long alfa;
    public Klasa(int liczba){
        this.liczba = liczba;
    }
    public String toString(){
        return "" + liczba;
    }
    public int getLiczba(){
        return liczba;
    }
}
