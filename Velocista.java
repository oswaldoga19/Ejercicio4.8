package CarreraCiclistica;

public class Velocista extends Ciclista {
    private double potenciaPromedio; // Atributo que define la potencia promedio de un velocista
    private double velocidadPromedio; // Atributo que define la velocidad promedio de un velocista

    /**
     * Constructor de la clase Velocista
     * @param identificador Parámetro que define el identificador de un velocista
     * @param nombre Parámetro que define el nombre de un velocista
     * @param potenciaPromedio Parámetro que define la potencia promedio de un velocista
     * @param velocidadPromedio Parámetro que define la velocidad promedio de un velocista
     */
    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    /**
     * Método que devuelve la potencia promedio de un velocista
     * @return La potencia promedio de un velocista
     */
    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    /**
     * Método que establece la potencia promedio de un velocista
     * @param potenciaPromedio Parámetro que especifica la potencia promedio de un velocista
     */
    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    /**
     * Método que devuelve la velocidad promedio de un velocista
     * @return La velocidad promedio de un velocista
     */
    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    /**
     * Método que establece la velocidad promedio de un velocista
     * @param velocidadPromedio Parámetro que especifica la velocidad promedio de un velocista
     */
    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    /**
     * Método que muestra en pantalla el tipo específico de un ciclista
     * @return Tipo de ciclista
     */
    @Override
    public String imprimirTipo() {
        return "Es un velocista";
    }

    /**
     * Método que muestra en pantalla los datos de un ciclista velocista
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Llama al método imprimir de la clase padre Ciclista
        System.out.println("Potencia promedio: " + potenciaPromedio);
        System.out.println("Velocidad promedio: " + velocidadPromedio);
    }
}
