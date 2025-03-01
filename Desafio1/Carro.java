class Carro{
    String marca;
    String modelo;
    int año;
    Carro(){}
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
    }
}
