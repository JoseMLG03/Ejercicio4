import java.util.Date;

class Empleado {
    final String nombre;
    private int edad;
    Date birthDate;

    Empleado(String name, int edad, Date fechaContratacion) {
        this.nombre = name;
        this.edad = edad;
        this.fechaContratacion = fechaContratacion;
    }
    public void setEdad(int edad) {
        if (edad<0) throw new RuntimeException("Un empleado no puede tener edad negativa");
        else this.edad = edad;
    }
    @Override
    public String toString() {
        return "Se ha registrado a " + nombre + " (" + edad + " años; contratado en 19" + fechaContratacion.getYear() + ")";
    }

}