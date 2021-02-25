/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balok;

/**
 *
 * @author ASUS X450JN
 */
public class hitung {
    int panjang;
    int lebar;
    int tinggi;
    int hasil;


void hitung(int panjang, int lebar, int tinggi){
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
}

int panjang(){
    return panjang;
}

int lebar(){
    return lebar;
}

int tinggi(){
    return tinggi;
}

int itung(){
    hasil = lebar * panjang * tinggi;
    System.out.println("luas balok = "+hasil);
    return hasil;
}

}

