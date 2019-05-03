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
}
