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
			arrayAlumnos[1] = "�lvarez, Javier";
			arrayAlumnos[2] = "ARGUDO RIVERA, Santiago";
			arrayAlumnos[3] = "BARRERO JIM�NEZ, Sergio";
			arrayAlumnos[4] = "CUBERO RINC�N, Mario";
			arrayAlumnos[5] = "FERN�NDEZ D�EZ, Carlos";
			arrayAlumnos[6] = "FERN�NDEZ RAM�REZ, Luis";
			arrayAlumnos[7] = "Garc�a Herrero, Germ�n";
			arrayAlumnos[8] = "GARC�A MART�N, Jorge";
			arrayAlumnos[9] = "GONZ�LEZ L�PEZ, Marco";
			arrayAlumnos[10] = "GONZ�LEZ MART�N, Sergio";
			arrayAlumnos[11] = "GORDO SAB�N, Borja";
			arrayAlumnos[12] = "Gutierrez Bermudez, Ricardo";
			arrayAlumnos[13] = "IGLESIAS D�AZ, Yago";
			arrayAlumnos[14] = "Jui�a, Juan";
			arrayAlumnos[15] = "LENIS CORTES, Juan Camilo";
			arrayAlumnos[16] = "LONDRES BLANES, Mart�n";
			arrayAlumnos[17] = "L�PEZ JIM�NEZ, Ignacio";
			arrayAlumnos[18] = "MART�NEZ CABRERA, Nicol�s";
			arrayAlumnos[19] = "MICHEL S�NCHEZ, �lvaro";
			arrayAlumnos[20] = "MOLINA PEDRAZA, Juan Carlos";
			arrayAlumnos[21] = "MORENO CASTRO, Jorge";
			arrayAlumnos[22] = "MORENO TOLEDANO, Juan";
			arrayAlumnos[23] = "MU�OZ HIDALGO, Andrea";
			arrayAlumnos[24] = "PARDOS SEVILLA, Carlos";
			arrayAlumnos[25] = "S�NCHEZ BORREGO, Daniel";
			arrayAlumnos[26] = "SEGURA G�MEZ, Andr�s";
			arrayAlumnos[27] = "SOTOMAYOR NAVARRETE, Jos� Mar�a";
		}

	}

	public String[] getArrayAlumnos() {
		return arrayAlumnos;
	}
	
	

}
