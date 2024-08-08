
public class Main {
    public static void main(String[] args) {

        Parqueadero parqueadero = new Parqueadero(5, 10, 2.5);

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("XYZ789", "Honda", "Civic");
        Carro carro3 = new Carro("LMN456", "Ford", "Fiesta");

        parqueadero.parquearCarro(carro1, 0, 0);
        parqueadero.parquearCarro(carro2, 1, 1);
        boolean resultado = parqueadero.parquearCarro(carro3, 0, 0); // Debería retornar false

        System.out.println("Resultado de estacionar en posición ocupada: " + resultado);

        double costo = parqueadero.cobrarPorTiempo(carro1, 5);
        System.out.println("Costo por 5 horas para carro con placa " + carro1.getPlaca() + ": " + costo);

        parqueadero.mostrarEstadoParqueadero();
    }
}