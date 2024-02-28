package Ej_2;

// Implementación concreta del procesador de pagos
public class PaymentProcessor_Implementado implements ServicioPago {

    private Pedido_Implementado pedido; // Pedido asociado al pago

    // Constructor que recibe el pedido asociado al pago
    public PaymentProcessor_Implementado(Pedido_Implementado pedido) {
        this.pedido = pedido;
    }


    // Método para procesar el pago con tarjeta
    public void pagarConTarjeta() {
        double totalAPagar = pedido.getPrecioTotal();
        System.out.println("El total a pagar con tarjeta es de -> [" + totalAPagar+"]");
        // Aquí iría la lógica para procesar el pago con tarjeta
    }

    // Método para procesar el pago en efectivo
    public void pagarEnEfectivo() {
        double totalAPagar = pedido.getPrecioTotal();
        System.out.println("El total a pagar en efectivo es de -> [" + totalAPagar+"]");
        // Aquí iría la lógica para procesar el pago en efectivo
    }

    // Método para procesar el pago
    @Override
    public void procesarPago(double precioTotal) {
        // Podrías usar el monto del pedido (pedido.getPrecioTotal())  y enseñarlo
        double monto = pedido.getPrecioTotal(); // Obtener el monto total del pedido
        System.out.println("Has pagado existosamente la cantidad de -> [" + monto+"]");
    }
}