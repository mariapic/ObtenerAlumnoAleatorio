package main;

import java.util.Random;
import java.util.Scanner;

import datos.Alumnos;

public class GeneradorAlumnosAlea {

	static Random rd;
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		rd = new Random();
		
		System.out.println("Introduce grupo:");
		String grupo = sc.nextLine();
		
		char resp = 'S';
		while (resp != 'N') {
			System.out.println("Desea obtener un alumno de forma aleatoria?(s/n)");
			resp = sc.nextLine().toUpperCase().charAt(0);
			
			if (resp == 'S') {
				mostrarAlumno(grupo);
			}
		}
		
		sc.close();
		

	}

	private static void mostrarAlumno(String grupo) {
		Alumnos datos = new Alumnos(grupo);
		int i = rd.nextInt(datos.getArrayAlumnos().length);
		System.out.println("*********************************");
		System.out.println("--> " + datos.getArrayAlumnos()[i]);
		System.out.println("*********************************");
	}
}
