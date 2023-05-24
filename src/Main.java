
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Empleado p = new Empleado("Pepe Pérez", new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);

        //p.nombre = "Manolo";
        //p.fechaContratacion = new Date(99, Calendar.FEBRUARY, 1);
    }
}

