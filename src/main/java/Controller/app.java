package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import DAO.notas;
import Impl.Consultas;

//Controlador de la aplicacion y encargado de ejecutar el main
@Controller
public class app {

	public static void main(String[] args) {
		
		//aplico las anotaciones provenientes del bean "context.xml", apartir de la
		//siguiente linea, hago las anotaciones validas.
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml"); 
		
		//obtengo el bean que hay en la clase consultas
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		//inserto lo siguiente en base de datos
		consulta.insertarNota(new notas("13B",null, 2, "11A", 0, null));
		
		
		//lo muestro
		System.out.println("Notas: " + consulta.muestraNotas());

	}

}
