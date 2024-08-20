package CarreraCiclistica;

/**
 * Esta clase prueba diferentes acciones realizadas por un equipo ciclístico
 * y sus diferentes corredores
 * @version 1.2/2020
 */
public class Prueba {
    /**
     * Método main que crea un equipo. Luego, crea un escalador, un
     * velocista y un contrarrelojista. Estos tipos de ciclistas son añadidos
     * al equipo. Se asignan tiempos a cada ciclista para al final obtener el
     * tiempo total del equipo
     */
    public static void main(String args[]) {
        // Creación del equipo
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");

        // Creación de ciclistas
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);

        // Añadir ciclistas al equipo
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);

        // Asignar tiempos a cada ciclista
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);

        // Calcular tiempo total del equipo
        equipo1.calcularTotalTiempo();

        // Imprimir información del equipo
        equipo1.imprimir();
        equipo1.listarEquipo();
        
    }
}