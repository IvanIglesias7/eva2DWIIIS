package DAO;

import java.util.List;

//Interfaz que será implementada en la clase notasServicioImpl.

public interface notasService {

	
	//Inserto notas en la base de datos
	public void insertaNotas(notas n);
	
	//Muestro por consola las notas en la base de datos
	public List<notas> muestraNotas();
}
