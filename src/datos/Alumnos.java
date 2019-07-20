package datos;

// prueba de cambio
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
			
		} else if (grupo.equals("M21")) {
			arrayAlumnos = new String[29];
			
			arrayAlumnos[0] = "BARO CARCAJONA, Alejandro Carlos";
			arrayAlumnos[1] = "CABRERA GUAILLAS, Cristhian Andr�s";
			arrayAlumnos[2] = "CAGUANA CHICAIZA, Luis Rosendo";
			arrayAlumnos[3] = "CEBAS BA�OS, V�ctor";
			arrayAlumnos[4] = "DIEZ SOBRINO, Cristina";
			arrayAlumnos[5] = "DONCEL IGLESIAS, �lvaro";
			arrayAlumnos[6] = "ESTEBAN, Carlos";
			arrayAlumnos[7] = "FERN�NDEZ OLIVA, Mart�n";
			arrayAlumnos[8] = "GARDE JIMENEZ, Juan Antonio";
			arrayAlumnos[9] = "HUEDO DEL CASTILLO, Alejandro Andr�s";
			arrayAlumnos[10] = "HUEDO DEL CASTILLO, Gonzalo";
			arrayAlumnos[11] = "LEGUINA CID, Gonzalo";
			arrayAlumnos[12] = "LLED� GOITIA, Gonzalo";
			arrayAlumnos[13] = "MART�NEZ INGELMO, Ricardo";
			arrayAlumnos[14] = "MEG�A OSORIO, Jorge";
			arrayAlumnos[15] = "MORENO VALDALISO, Javier";
			arrayAlumnos[16] = "MURUZABAL ISHIGETANI, Javier Yechoen";
			arrayAlumnos[17] = "NAVARRO MANZANO, Sergio";
			arrayAlumnos[18] = "NOTARIO CARRETERO, Juan";
			arrayAlumnos[19] = "OLMEDO ORTIZ, Fernando";
			arrayAlumnos[20] = "ORD�S FERN�NDEZ, Ra�l";
			arrayAlumnos[21] = "P�REZ G�MEZ, Andr�s";
			arrayAlumnos[22] = "PI�A MART�N, �lvaro";
			arrayAlumnos[23] = "ROSERO CAPELO, Steven Alberto";
			arrayAlumnos[24] = "SABBAGH PASTOR, Yoseph Daniel";
			arrayAlumnos[25] = "S�NCHEZ D�AZ, Miguel";
			arrayAlumnos[26] = "SANTA CRUZ ESTEB�N, �lvaro";
			arrayAlumnos[27] = "VILLARREAL GUILLO, Dar�o";
			arrayAlumnos[28] = "WENG, Jincheng";
		}

	}

	public String[] getArrayAlumnos() {
		return arrayAlumnos;
	}
	
	

}
