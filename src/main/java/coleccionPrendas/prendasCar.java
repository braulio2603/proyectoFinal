package coleccionPrendas;

public class prendasCar {

    public String categoriaPrenda;
    public String nombrePrenda;
    public double precioPrenda;
    public String id;

    prendasCar(){
        this.categoriaPrenda = categoriaPrenda;
        this.nombrePrenda = nombrePrenda;
        this.precioPrenda = precioPrenda;
        this.id = id;
    }

       public String getCategoriaPrenda() {
        return categoriaPrenda;
    }

    public void setCategoriaPrenda(String categoriaPrenda) {
        this.categoriaPrenda = categoriaPrenda;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public double getPrecioPrenda() {
        return precioPrenda;
    }

    public void setPrecioPrenda(double precioPrenda) {
        this.precioPrenda = precioPrenda;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
