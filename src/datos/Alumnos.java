package datos;

public class Alumnos {
	private String grupo;
	private String[] arrayAlumnos;

	public Alumnos(String grupo) {
		cargarGrupo(grupo);
	}

	private void cargarGrupo(String grupo) {
		if (grupo.equals("M11")) {
			arrayAlumnos = new String[28];

			arrayAlumnos[0] = "ALONSO CASILDA, Daniel";
			arrayAlumnos[1] = "Álvarez, Javier";
			arrayAlumnos[2] = "ARGUDO RIVERA, Santiago";
			arrayAlumnos[3] = "BARRERO JIMÉNEZ, Sergio";
			arrayAlumnos[4] = "CUBERO RINCÓN, Mario";
			arrayAlumnos[5] = "FERNÁNDEZ DÍEZ, Carlos";
			arrayAlumnos[6] = "FERNÁNDEZ RAMÍREZ, Luis";
			arrayAlumnos[7] = "García Herrero, Germán";
			arrayAlumnos[8] = "GARCÍA MARTÍN, Jorge";
			arrayAlumnos[9] = "GONZÁLEZ LÓPEZ, Marco";
			arrayAlumnos[10] = "GONZÁLEZ MARTÍN, Sergio";
			arrayAlumnos[11] = "GORDO SABÍN, Borja";
			arrayAlumnos[12] = "Gutierrez Bermudez, Ricardo";
			arrayAlumnos[13] = "IGLESIAS DÍAZ, Yago";
			arrayAlumnos[14] = "Juiña, Juan";
			arrayAlumnos[15] = "LENIS CORTES, Juan Camilo";
			arrayAlumnos[16] = "LONDRES BLANES, Martín";
			arrayAlumnos[17] = "LÓPEZ JIMÉNEZ, Ignacio";
			arrayAlumnos[18] = "MARTÍNEZ CABRERA, Nicolás";
			arrayAlumnos[19] = "MICHEL SÁNCHEZ, Álvaro";
			arrayAlumnos[20] = "MOLINA PEDRAZA, Juan Carlos";
			arrayAlumnos[21] = "MORENO CASTRO, Jorge";
			arrayAlumnos[22] = "MORENO TOLEDANO, Juan";
			arrayAlumnos[23] = "MUÑOZ HIDALGO, Andrea";
			arrayAlumnos[24] = "PARDOS SEVILLA, Carlos";
			arrayAlumnos[25] = "SÁNCHEZ BORREGO, Daniel";
			arrayAlumnos[26] = "SEGURA GÓMEZ, Andrés";
			arrayAlumnos[27] = "SOTOMAYOR NAVARRETE, José María";
		}

	}

	public String[] getArrayAlumnos() {
		return arrayAlumnos;
	}
	
	

}
