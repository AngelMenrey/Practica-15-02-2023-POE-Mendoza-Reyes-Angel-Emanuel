package clase15022023;

public class Alumno extends Persona{
    private int promedio, registro;

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
    
    public Alumno(int promedio, int registro, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.promedio = promedio;
        this.registro = registro;
    }
    
public Alumno(){
super();
this.registro=-1;
this.promedio=-1;
}

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
//getters
    public int getPromedio() {
        return promedio;
    }

    public int getRegistro() {
        return registro;
    }
}

