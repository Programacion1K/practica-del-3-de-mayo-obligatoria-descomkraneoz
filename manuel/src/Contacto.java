import java.util.Objects;
import java.util.UUID;

public class Contacto implements Comparable<Contacto>{
    private final String nombre;
    private final String codigo;
    UUID id = UUID.randomUUID();

    public Contacto(String nombre) {
        this.nombre = nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase();
        this.codigo = id.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String info() {
        String salida = "";
        salida += "Con el id = " + getCodigo()+ " tenemos el contacto: " + getNombre();
        return salida;
    }

    @Override
    public String toString() {
        return codigo + " : " + nombre;
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

    @Override
    public int compareTo(Contacto o){
        return this.codigo.compareTo(o.codigo);
    }

    public static void main(String[] args) {
        Contacto c1 = new Contacto("Pepe");
        Contacto c2 = new Contacto("Manuel");
        System.out.println(c1.info());
        System.out.println(c2.info());
        System.out.println(c1.equals(c2));

    }
}


