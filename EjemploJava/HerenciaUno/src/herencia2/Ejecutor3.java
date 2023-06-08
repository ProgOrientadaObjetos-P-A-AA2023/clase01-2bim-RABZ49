/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        int op = 0;
        System.out.println("Ingrese 1 para estudiante a distancia o "
                + "2 para prensencial:");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                
                entrada.nextLine();
                System.out.println("Ingrese nombres");
                
                String nombres = entrada.nextLine();
                
                System.out.println("Ingrese apellidos");
                String apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación");
                String identificacion = entrada.nextLine();
                System.out.println("Ingrese edad");
                int edad = entrada.nextInt();
                System.out.println("Ingrese número de asignaturas");
                int asignaturas = entrada.nextInt();
                System.out.println("Ingrese costo asignatura");
                double costoAsignatura = entrada.nextDouble();
                EstudianteDistancia estudiante = new EstudianteDistancia();

                estudiante.establecerNombresEstudiante(nombres);
                estudiante.establecerApellidoEstudiante(apellidos);
                estudiante.establecerEdadEstudiante(edad);
                estudiante.establecerIdentificacionEstudiante(identificacion);
                estudiante.establecerNumeroAsginaturas(asignaturas);
                estudiante.establecerCostoAsignatura(costoAsignatura);
                estudiante.calcularMatriculaDistancia();

                System.out.printf("%s\n", estudiante);
                break;
            case 2:
                entrada.nextLine();
                
                System.out.println("Ingrese nombres");
                String nombresp = entrada.nextLine();
                System.out.println("Ingrese apellidos");
                String apellidosp = entrada.nextLine();
                System.out.println("Ingrese identificación");
                String identificacionp = entrada.nextLine();
                System.out.println("Ingrese edad");
                int edadp = entrada.nextInt();
                System.out.println("Ingrese número de creditos");
                int creditos = entrada.nextInt();
                System.out.println("Ingrese costo creditos");
                double costocretidos = entrada.nextDouble();
                EstudiantePresencial estudiantep = new EstudiantePresencial();

                estudiantep.establecerNombresEstudiante(nombresp);
                estudiantep.establecerApellidoEstudiante(apellidosp);
                estudiantep.establecerEdadEstudiante(edadp);
                estudiantep.establecerIdentificacionEstudiante(identificacionp);
                estudiantep.establecerNumeroCreditos(creditos);
                estudiantep.establecerCostoCredito(costocretidos);
                estudiantep.calcularMatriculaPresencial();

                System.out.printf("%s\n", estudiantep);
                break;
            default:
                System.out.println("opcion no encontrada");
        }

    }
}
