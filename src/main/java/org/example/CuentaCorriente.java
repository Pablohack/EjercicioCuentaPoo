package org.example;

public class CuentaCorriente extends Cuenta{
    public float sobregiro = 0;

    CuentaCorriente(float saldo, float tasaAnual){
        super(saldo,tasaAnual);
    }
    public void retirar(float cantidad){
        float saldoRetirar = this.getSaldo() - cantidad;
        if(saldoRetirar < 0){
            this.sobregiro = sobregiro - saldoRetirar;
            setSaldo(0);
        }else{
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad){
        float diferencia =  cantidad - this.sobregiro;

        if(this.sobregiro > 0){
            if(diferencia > 0){
                this.sobregiro = 0;
                setSaldo(diferencia);
            }
            else{
                this.sobregiro -= diferencia;
                setSaldo(0);
            }
        }else{
            super.consignar(cantidad);
        }
    }
}
