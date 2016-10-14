
package centralitaelectronica;


public class CentralitaElectronica {

    
    public static void main(String[] args) {
    
       Consumo Consume = new Consumo();
       Consume.setLitros(50f);
       Consume.setpGasolina(1.57f);
       //primer objeto
       
       Consumo Consumo = new Consumo(350f,1.57f,120f,50f);
       
       float consumomedio = Consumo.getConsumoMedio();
       System.out.println("el consumo medio es de "+ Consumo);
     
       float VelocidadeMedia = Consumo.getTempo();
        System.out.println(" el tiempo empleado en el viaje es de "+ VelocidadeMedia);
        
       float ConsumoEnEuros = Consumo.getConsumoEuros();
        System.out.println("El consumo de Euros es de "+ ConsumoEnEuros);
       //segundo objeto 
    }
    
}
