package CarreraCiclistica;

public class Contrarrelojista extends Ciclista {
    private double velocidadMáxima; // Atributo que define la velocidad máxima de un contrarrelojista

    /**
     * Constructor de la clase Contrarrelojista
     * @param identificador Parámetro que define el identificador de un contrarrelojista
     * @param nombre Parámetro que define el nombre de un contrarrelojista
     * @param velocidadMáxima Parámetro que define la velocidad máxima de un contrarrelojista
     */
    public Contrarrelojista(int identificador, String nombre, double velocidadMáxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }

    /**
     * Método que devuelve la velocidad máxima de un contrarrelojista
     * @return La velocidad máxima de un contrarrelojista
     */
    public double getVelocidadMáxima() {
        return velocidadMáxima;
    }

    /**
     * Método que establece la velocidad máxima de un contrarrelojista
     * @param velocidadMáxima Parámetro que especifica la velocidad máxima de un contrarrelojista
     */
    public void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    /**
     * Método que muestra en pantalla el tipo específico de un ciclista
     * @return Tipo de ciclista
     */
    @Override
    public String imprimirTipo() {
        return "Es un contrarrelojista";
    }

    /**
     * Método que muestra en pantalla los datos de un ciclista contrarrelojista
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Llama al método imprimir de la clase padre Ciclista
        System.out.println("Velocidad máxima: " + velocidadMáxima);
    }
}
