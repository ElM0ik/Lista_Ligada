public class articulo {
    String nombre;
    float precio;

    //constructor
    public articulo(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + "$";
    }
}
//la rubrica: ¡Vas a usar cammelCase y te gustara!