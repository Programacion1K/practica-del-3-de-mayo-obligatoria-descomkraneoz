import java.util.*;

public class Agenda implements Comparable {
    Map<Contacto, List<Item>> listaAgenda = new TreeMap<>();

    public Map<Contacto, List<Item>> getListaAgenda() {
        return listaAgenda;
    }

    public void anyadeContacto(Contacto c) {
        listaAgenda.put(c, new ArrayList<>());
    }

    public void anyadeItem(Contacto c, Item i) {
        listaAgenda.get(c).add(i);
    }

    public void anyadeItem(Contacto c, List<Item> lista) {
        listaAgenda.put(c, lista);
    }

    public String listadoContactos() {
        String salida = "";
        for (Contacto c : listaAgenda.keySet()
        ) {
            salida += c;
        }
        return salida;
    }

    public String listadoItems() {
        String salida = "";
        for (List<Item> i : listaAgenda.values()
        ) {
            salida += i;
        }
        return salida;
    }


    public List<Item> listaItem(Contacto c) {
        return listaAgenda.get(c);
    }

    /*public List<Contacto> listaInformacion(String nombreItem){


        return ;
    }*/

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
