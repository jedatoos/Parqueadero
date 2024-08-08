// Parqueadero
public class Parqueadero {
    private Carro[][] espacio;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        espacio = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= espacio.length || columna < 0 || columna >= espacio[0].length || espacio[fila][columna] != null) {
            return false;
        }
        espacio[fila][columna] = carro;
        return true;
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < espacio.length; i++) {
            for (int j = 0; j < espacio[i].length; j++) {
                if (espacio[i][j] != null) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}