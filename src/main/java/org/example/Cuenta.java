package org.example;

public class Cuenta {
    private float saldo;
    private int numeroConsignaciones = 0;
    public int numeroRetiros = 0;
    public float tasaAnual;
    public float comisionMensual = 0;

    Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        this.saldo = this.saldo + cantidad;
        this.numeroConsignaciones += 1;
        // this.numeroConsignaciones =  this.numeroConsignaciones + 1;
    }

    public void retirar(float cantidad) {
        float nuevoSaldo = this.saldo - cantidad;

        if (nuevoSaldo >= 0) {
            this.saldo -= cantidad;
            this.numeroRetiros += 1;
        } else {
            throw new Error("La cantidad a retirar excede el saldo actual");
        }
    }

    public void calcularInteres(){

        float tasaMensual = this.tasaAnual / 12;

        float interesMensual = (this.saldo * tasaMensual) / 100;
        this.saldo += interesMensual;
    }
    public void extractoMensual(){
            this.saldo -= this.comisionMensual;
            calcularInteres();
        }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float cantidad){
        this.saldo = cantidad;
    }
}
