//3. En un nuevo proyecto crear una clase de nombre Jugador con los atributos: nombre,
//puntaje, nacionalidad y edad. Luego un constructor vació y un constructor que inicialice
//todos sus atributos; agregue además los respectivos métodos getter y setter. Desde el
//método main de la clase principal del proyecto crear un Jugador utilizando el constructor
//vacío; luego, a dicho jugador darle de nombre “Juan”, con 140 puntos, de nacionalidad
//“Argentino” y una edad de 29 años; por último mostrar por consola el estado de cada uno
//de sus atributos.
package ejercicio3;

/**
 *
 * @author dario
 */
public class Jugador {

    private String nombre;
    private int puntaje;
    private String nacionalidad;
    private int edad;
    
    public Jugador(){}
    
    public Jugador(String nombre, int puntaje, String nacionalidad, int edad)
    {
       this.nombre=nombre;
       this.puntaje=puntaje;
       this.nacionalidad=nacionalidad;
       this.edad=edad;
                  
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

}

   
    
    
    
    
    
 