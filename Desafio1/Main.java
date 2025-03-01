import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacionamiento est = new Estacionamiento();
        Estacionamiento estd = new Estacionamiento();
        Carro carr = new Carro();
        Carro carr2 = new Carro();
        Escuela esc = new Escuela();
        Escuela esc2 =new Escuela();

        System.out.println("***Registra tus datos de la escuela****");
        System.out.println("Tu profesor, tu nombre y matricula de alumno");
        esc.setProfesor(sc.nextLine());
        esc.setAlumno(sc.nextLine());
        esc.setId(sc.nextInt());

        System.out.println("***Registra tu carro:***");
        System.out.println("Marca, Modelo y Año:");
        carr.setMarca(sc.nextLine());
        carr.setModelo(sc.nextLine());
        carr.setAño(sc.nextInt());

        System.out.println("***Registra tu lugar de estacionamiento:***");
        System.out.println("Matricula, Horas y Lugar:");
        est.setMatricula(sc.nextLine());
        est.setHoras(sc.nextInt());
        est.setLugar(sc.nextInt());
        
        System.out.println("***Registra tus datos de la escuela****");
        System.out.println("Tu profesor, tu nombre y matricula de alumno");
        esc2.setProfesor(sc.nextLine());
        esc2.setAlumno(sc.nextLine());
        esc2.setId(sc.nextInt());

        System.out.println("***Registra tu carro:***");
        System.out.println("Marca, Modelo y Año:");
        carr2.setMarca(sc.nextLine());
        carr2.setModelo(sc.nextLine());
        carr2.setAño(sc.nextInt());

        System.out.println("***Registra tu lugar de estacionamiento:***");
        System.out.println("Matricula, Horas y Lugar:");
        estd.setMatricula(sc.nextLine());
        estd.setHoras(sc.nextInt());
        estd.setLugar(sc.nextInt());

        List<Escuela> lugares = new ArrayList<>();
        List<Carro> carro = new ArrayList<>();
        List<Estacionamiento> estacionamiento = new ArrayList<>();
        lugares.add(esc);
        lugares.add(esc2);
        carro.add(carr);
        carro.add(carr2);
        estacionamiento.add(est);
        estacionamiento.add(estd);

        System.out.println(lugares);
        System.out.println(carro);
        System.out.println(estacionamiento);
    }
}