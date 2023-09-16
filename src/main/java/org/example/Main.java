package org.example;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(4000,2);

        cc.retirar(6000);

        System.out.println(cc.sobregiro);

        cc.consignar(1000);
        System.out.println("------------------------");
        System.out.println(cc.sobregiro);
        System.out.println(cc.getSaldo());
        System.out.println("------------------------");

    }
}