package org.example;

public class CuentaAhorro extends Cuenta{
  public boolean active;

  CuentaAhorro(float saldo,float tasaAnual){
      super(saldo,tasaAnual);
      if(saldo >= 15000){
          this.active = true;
      }else {
          this.active = false;
      }
  }

  public void retirar(float cantidad){
      if(this.active){
          super.retirar(cantidad);
      } else{
          throw new Error("La cuenta no esta activa");
      }
  }

  public void consignar(float cantidad){
      if(this.active){
          super.consignar(cantidad);
      }else{
          throw new Error("La cuenta no esta activa");
      }
  }

  public void extractoMensual(){
      if(this.numeroRetiros > 4){
          this.comisionMensual += (numeroRetiros - 4) * 1000;
      }
      super.extractoMensual();
      if(super.getSaldo() < 15000){
          this.active = false;
      }
  }

}
