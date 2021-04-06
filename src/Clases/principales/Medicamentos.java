package Clases.principales;



public class Medicamentos {
    private int id_medicamento;
    private String nombre;
    private int id_tipo_medicamento;
    private int precio;    
    private int contenido;    
    private int id_presentacion;
    private int existencias;
    private int caducidad;
    private int id_ubicacion;      

    public Medicamentos(){
        
    }
    
    public Medicamentos(int id_medicamento, String nombre, int id_tipo_medicamento, int precio, int contenido,  int id_presentacion,  int existencias, int caducidad, int id_ubicacion){
        this.id_medicamento = id_medicamento;
        this.nombre = nombre;
        this.id_tipo_medicamento = id_tipo_medicamento;        
        this.precio = precio;
        this.contenido = contenido;
        this.id_presentacion = id_presentacion;
        this.existencias = existencias;
        this.caducidad = caducidad;
        this.id_ubicacion = id_ubicacion;        
    }

    /**
     * @return the id_medicamento
     */
    public int getId_medicamento() {
        return id_medicamento;
    }

    /**
     * @param id_medicamento the id_medicamento to set
     */
    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id_tipo_medicamento
     */
    public int getId_tipo_medicamento() {
        return id_tipo_medicamento;
    }

    /**
     * @param id_tipo_medicamento the id_tipo_medicamento to set
     */
    public void setId_tipo_medicamento(int id_tipo_medicamento) {
        this.id_tipo_medicamento = id_tipo_medicamento;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the contenido
     */
    public int getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the id_presentacion
     */
    public int getId_presentacion() {
        return id_presentacion;
    }

    /**
     * @param id_presentacion the id_presentacion to set
     */
    public void setId_presentacion(int id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    /**
     * @return the existencias
     */
    public int getExistencias() {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    /**
     * @return the caducidad
     */
    public int getCaducidad() {
        return caducidad;
    }

    /**
     * @param caducidad the caducidad to set
     */
    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }

    /**
     * @return the id_ubicacion
     */
    public int getId_ubicacion() {
        return id_ubicacion;
    }

    /**
     * @param id_ubicacion the id_ubicacion to set
     */
    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }


}
    
    
