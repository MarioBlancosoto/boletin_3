
package centralitaelectronica;

import javax.swing.JOptionPane;


public class Consumo {
    //declaro atributos
    private float kilometros,pGasolina,vMedia,litros;

//declaramos métodos
public Consumo(){
    
    kilometros = 0;
    pGasolina =0;
    vMedia = 0;
    litros = 0;
     
}
public Consumo(float km,float pGasol,float ltr,float velMedia){
    kilometros = km;
    pGasolina = pGasol;
    vMedia = velMedia;
    litros = ltr;
    
}

    public float getKilometros() {
        return kilometros;
    }

    public void setKilometros(float kilometros) {
        kilometros = kilometros;
    }

    public float getpGasolina() {
        return pGasolina;
    }

    public void setpGasolina(float pGasolina) {
        pGasolina = pGasolina;
    }

    public float getTempo() {
        return kilometros/vMedia;
    }

    public void setTempo(float tempo) {
        tempo = tempo;
    }

    public void setLitros(float litros) {
        litros = litros;
    }

    public void setvMedia() {
        vMedia = vMedia;
        
       }


    public float getConsumoMedio() {
        return (kilometros/100)*litros;
    }

  

    public float getConsumoEuros() {
        return (kilometros/100)*pGasolina;
    }


    
}
