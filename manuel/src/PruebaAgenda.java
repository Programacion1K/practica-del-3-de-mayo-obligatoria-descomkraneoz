import java.util.ArrayList;
import java.util.List;

public class PruebaAgenda {
    public static void main(String[] args) {
        Agenda miAgenda=new Agenda();
        Contacto ana=new Contacto("ana");
        Contacto bea=new Contacto("bea");
        Contacto clara=new Contacto("clara");
        miAgenda.anyadeContacto(ana);
        miAgenda.anyadeContacto(bea);
        miAgenda.anyadeContacto(clara);
        miAgenda.anyadeItem(ana,new Item("Teléfono","9999999"));
        miAgenda.anyadeItem(ana,new Item("Dirección","C/ Mayor,8"));
        miAgenda.anyadeItem(bea,new Item("Teléfono","6666666"));
        miAgenda.anyadeItem(bea,new Item("Libro Favorito","El Quijote"));
        miAgenda.anyadeItem(clara,new Item("Comida Favorita","Sushi"));

        System.out.println(miAgenda.listadoAgenda());


    }
}
