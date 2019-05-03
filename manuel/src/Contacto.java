import java.math.BigInteger;
import java.util.Objects;
import java.util.Random;

public class Contacto {
    private final String nombre;
    private final String apellidos;
    private final String codigo;
    Random random = new Random();

    public Contacto(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = (new BigInteger(50, random).toString(32));
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return codigo + " : " + apellidos + ", " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(codigo, contacto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public static void main(String[] args) {
        Contacto c1 = new Contacto("Pepe", "Viyuela Martínez");
        System.out.println(c1);
    }
}


