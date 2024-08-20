package CarreraCiclistica;

public class Escalador extends Ciclista {
    private double aceleraciónPromedio; // Atributo que define la aceleración promedio de un escalador
    private double gradoRampa; // Atributo que define el grado de rampa que es capaz de subir

    /**
     * Constructor de la clase Escalador
     * @param identificador Parámetro que define el identificador de un escalador
     * @param nombre Parámetro que define el nombre de un escalador
     * @param aceleraciónPromedio Parámetro que define la aceleración promedio de un escalador
     * @param gradoRampa Parámetro que define el grado de rampa que es capaz de subir un escalador
     */
    public Escalador(int identificador, String nombre, double aceleraciónPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleraciónPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
    }

    /**
     * Método que devuelve la aceleración promedio de un escalador
     * @return La aceleración promedio de un escalador
     */
    public double getAceleraciónPromedio() {
        return aceleraciónPromedio;
    }

    /**
     * Método que establece la aceleración promedio de un escalador
     * @param aceleraciónPromedio Parámetro que especifica la aceleración promedio de un escalador
     */
    public void setAceleraciónPromedio(double aceleraciónPromedio) {
        this.aceleraciónPromedio = aceleraciónPromedio;
    }

    /**
     * Método que devuelve el grado de rampa que es capaz de subir un escalador
     * @return El grado de rampa que es capaz de subir un escalador
     */
    public double getGradoRampa() {
        return gradoRampa;
    }

    /**
     * Método que establece el grado de rampa que es capaz de subir un escalador
     * @param gradoRampa Parámetro que especifica el grado de rampa que es capaz de subir un escalador
     */
    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    /**
     * Método que muestra en pantalla el tipo específico de un ciclista
     * @return Tipo de ciclista
     */
    @Override
    public String imprimirTipo() {
        return "Es un escalador";
    }

    /**
     * Método que muestra en pantalla los datos de un ciclista escalador
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Llama al método imprimir de la clase padre Ciclista
        System.out.println("Aceleración promedio: " + aceleraciónPromedio);
        System.out.println("Grado de rampa: " + gradoRampa);
    }
}
