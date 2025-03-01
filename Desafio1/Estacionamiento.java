class Estacionamiento{
    String matricula;
    int horas, lugar;

    Estacionamiento(){}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Estacionamiento [matricula=" + matricula + ", horas=" + horas + ", lugar=" + lugar + "]";
    }
    

}