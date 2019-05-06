import java.util.*;

public class Agenda {
    Map<Contacto, List<Item>> listaAgenda = new TreeMap<>();

    public Map<Contacto, List<Item>> getListaAgenda() {
        return listaAgenda;
    }

    public void anyadeContacto(Contacto c) {
        listaAgenda.put(c, new ArrayList<>());
    }

    public void anyadeContacto(Contacto c, List<Item> lista) {
        listaAgenda.put(c, lista);
    }

    public void anyadeItem(Contacto c, Item i) {
        listaAgenda.get(c).add(i);
    }

    public List<Item> listaItem(Contacto c) {
        return listaAgenda.get(c);
    }

    public List<Contacto> listadoContactos(){
        List<Contacto> contactosAgenda=new LinkedList<>();
        Iterator it=contactosAgenda.iterator();
        Contacto c=new Contacto("");

        while (it.hasNext()){
            contactosAgenda.add(c);
        }
        return contactosAgenda;
    }

    public String listadoAgenda() {
        String salida = "";
        for (Contacto c : listaAgenda.keySet()
        ) {
            salida += c.info()+". ";
            for (Item i:listaItem(c)
                 ) {
                salida+=i.infoItem()+"\n";
            }
        }
        return salida;
    }

    public List<Contacto> buscarContactosPorItem(String nombreItem){
        Item itemComprobar=new Item(nombreItem,"");
        List<Contacto> contactosConElItem=new ArrayList<>();
        for (Contacto c:listaAgenda.keySet()){
            if(listaAgenda.get(c).contains(itemComprobar)){
                contactosConElItem.add(c);
            }
        }
        return contactosConElItem;
    }
}
