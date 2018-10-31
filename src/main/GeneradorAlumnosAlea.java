package main;

import java.util.Random;

import datos.Alumnos;

public class GeneradorAlumnosAlea {

	public static void main(String[] args) {
		Random rd = new Random();
		Alumnos datos = new Alumnos();
		int i = rd.nextInt(datos.arrayAlumnos.length);
		System.out.println(datos.arrayAlumnos[i]);

	}

}
