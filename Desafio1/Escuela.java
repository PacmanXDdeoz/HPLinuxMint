class Escuela{
    String profesor;
    String alumno;
    int id;
    Escuela(){}
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public String getAlumno() {
        return alumno;
    }
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Escuela [profesor=" + profesor + ", alumno=" + alumno + ", id=" + id + "]";
    }
    
}