package Ej_2;


//Interfaz que define el contrato para un servicio de pago.(Payment processor)
public interface ServicioPago {
    //Procesa un pago con el monto especificado
    void procesarPago(double precioTotal);
}



