import java.util.Objects;

public class Item {
    private String nombreItem;
    private String informacionItem;

    public Item(String nombreItem, String informacionItem) {
        this.nombreItem = nombreItem;
        this.informacionItem = informacionItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getInformacionItem() {
        return informacionItem;
    }

    public void setInformacionItem(String informacionItem) {
        this.informacionItem = informacionItem;
    }

    @Override
    public String toString() {
        return nombreItem + ": " + informacionItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(nombreItem, item.nombreItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreItem);
    }

    public String infoItem() {
        String salida = "";
        salida += "Detalles del contacto: " + nombreItem + ": " + informacionItem;
        return salida;
    }

}
