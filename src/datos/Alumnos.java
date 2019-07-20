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
			
		} else if (grupo.equals("M21")) {
			arrayAlumnos = new String[29];
			
			arrayAlumnos[0] = "BARO CARCAJONA, Alejandro Carlos";
			arrayAlumnos[1] = "CABRERA GUAILLAS, Cristhian Andrés";
			arrayAlumnos[2] = "CAGUANA CHICAIZA, Luis Rosendo";
			arrayAlumnos[3] = "CEBAS BAÑOS, Víctor";
			arrayAlumnos[4] = "DIEZ SOBRINO, Cristina";
			arrayAlumnos[5] = "DONCEL IGLESIAS, Álvaro";
			arrayAlumnos[6] = "ESTEBAN, Carlos";
			arrayAlumnos[7] = "FERNÁNDEZ OLIVA, Martín";
			arrayAlumnos[8] = "GARDE JIMENEZ, Juan Antonio";
			arrayAlumnos[9] = "HUEDO DEL CASTILLO, Alejandro Andrés";
			arrayAlumnos[10] = "HUEDO DEL CASTILLO, Gonzalo";
			arrayAlumnos[11] = "LEGUINA CID, Gonzalo";
			arrayAlumnos[12] = "LLEDÓ GOITIA, Gonzalo";
			arrayAlumnos[13] = "MARTÍNEZ INGELMO, Ricardo";
			arrayAlumnos[14] = "MEGÍA OSORIO, Jorge";
			arrayAlumnos[15] = "MORENO VALDALISO, Javier";
			arrayAlumnos[16] = "MURUZABAL ISHIGETANI, Javier Yechoen";
			arrayAlumnos[17] = "NAVARRO MANZANO, Sergio";
			arrayAlumnos[18] = "NOTARIO CARRETERO, Juan";
			arrayAlumnos[19] = "OLMEDO ORTIZ, Fernando";
			arrayAlumnos[20] = "ORDÁS FERNÁNDEZ, Raúl";
			arrayAlumnos[21] = "PÉREZ GÓMEZ, Andrés";
			arrayAlumnos[22] = "PIÑA MARTÍN, Álvaro";
			arrayAlumnos[23] = "ROSERO CAPELO, Steven Alberto";
			arrayAlumnos[24] = "SABBAGH PASTOR, Yoseph Daniel";
			arrayAlumnos[25] = "SÁNCHEZ DÍAZ, Miguel";
			arrayAlumnos[26] = "SANTA CRUZ ESTEBÁN, Álvaro";
			arrayAlumnos[27] = "VILLARREAL GUILLO, Darío";
			arrayAlumnos[28] = "WENG, Jincheng";
		}

	}

	public String[] getArrayAlumnos() {
		return arrayAlumnos;
	}
	
	

}
