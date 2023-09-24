package coleccionClientes;

public class clientes {

    public String nombre;
    public String direccion;
    public int telefono;
    public String pagoElectronico;

    public clientes(String nombre, String direccion){//, int telefono, String pagoElectronico){
        this.nombre = nombre;
        this.direccion = direccion;
       //this.telefono = telefono;
       // this.pagoElectronico = pagoElectronico;
            }
            public String getNombre(){
                    return nombre;
            }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
            }

            public void setDireccion(String direccion){
                    this.direccion = direccion;

            }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPagoElectronico() {
        return pagoElectronico;
    }

    public void setPagoElectronico(String pagoElectronico) {
        this.pagoElectronico = pagoElectronico;
    }
}
