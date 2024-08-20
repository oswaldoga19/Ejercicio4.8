package CarreraCiclistica;
import java.util.*;

public class Equipo {
    private String nombre; // Atributo que define el nombre del equipo de ciclismo
    private static double totalTiempo; // Atributo que define el tiempo total obtenido por el equipo
    private String país; // Atributo que define el país al que pertenece el equipo
    private Vector<Ciclista> listaCiclistas; // Atributo que define un vector de objetos ciclista

    /**
     * Constructor de la clase Equipo
     * @param nombre Parámetro que define el nombre del equipo
     * @param país Parámetro que define el país del equipo
     */
    public Equipo(String nombre, String país) {
        this.nombre = nombre;
        this.país = país;
        totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
        listaCiclistas = new Vector<>(); // Se crea el vector de ciclistas que conforma el equipo
    }

    /**
     * Método que devuelve el nombre del equipo
     * @return El nombre del equipo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de un equipo
     * @param nombre Parámetro que especifica el nombre de un equipo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el país del equipo
     * @return El país del equipo
     */
    private String getPaís() {
        return país;
    }

    /**
     * Método que establece el país de un equipo
     * @param país Parámetro que especifica el país de un equipo
     */
    private void setPaís(String país) {
        this.país = país;
    }

    /**
     * Método que añade un ciclista al vector de ciclistas de un equipo
     */
    protected void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }

    /**
     * Método que muestra en pantalla los nombres de los ciclistas que conforman un equipo
     */
    protected void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }

    /**
     * Método que busca un ciclista ingresado por teclado
     */
    protected void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del ciclista: ");
        String nombreCiclista = sc.nextLine();
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.elementAt(i);
            if (c.getNombre().equals(nombreCiclista)) {
                c.imprimir();
                return;
            }
        }
        System.out.println("Ciclista no encontrado.");
    }

    /**
     * Método que calcula el tiempo total de un equipo acumulando el tiempo obtenido por cada uno de sus ciclistas
     */
    protected void calcularTotalTiempo() {
        totalTiempo = 0;
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.elementAt(i);
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    /**
     * Método que muestra en pantalla los datos de un equipo
     */
    protected void imprimir() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("País: " + país);
        System.out.println("Total tiempo del equipo: " + totalTiempo);
    }
    
}