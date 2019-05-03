import java.util.ArrayList;
import java.util.List;

public class PruebaAgenda {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();
        Contacto ana = new Contacto("ana");
        Item anaItem1 = new Item("Teléfono", "999999999");
        Item anaItem2 = new Item("Dirección", "C/ Mayor, 8");

        miAgenda.anyadeContacto(ana);
        miAgenda.anyadeItem(ana, anaItem1);
        List<Item> anaItems = new ArrayList<>();
        anaItems.add(anaItem1);
        anaItems.add(anaItem2);
        miAgenda.anyadeItem(ana, anaItems);

    }
}
