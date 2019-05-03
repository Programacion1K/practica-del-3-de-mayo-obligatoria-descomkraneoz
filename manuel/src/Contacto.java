import java.math.BigInteger;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Contacto {
    private final String nombreCompleto;
    private final String codigo;
    UUID id = UUID.randomUUID();

    public Contacto(String nombre) {
        this.nombreCompleto = nombre;
        this.codigo = id.toString();
    }

    public String getNombre() {
        return nombreCompleto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String info() {
        String salida = "";
        salida += "El contacto: " + getNombre() + " tiene un id = " + getCodigo();
        return salida;
    }

    @Override
    public String toString() {
        return codigo + " : " + nombreCompleto;
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
        Contacto c1 = new Contacto("Pepe Viyuela Martínez");
        System.out.println(c1.info());
    }
}


