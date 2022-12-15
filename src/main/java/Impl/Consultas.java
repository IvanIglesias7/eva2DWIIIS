package Impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import DAO.*;

@Component
public class Consultas {

	@Autowired
	private notasServiceImpl nsi;
	
	@Transactional //se encarga de la transaccion
	public void insertarNota(notas n) {
		nsi.insertaNotas(n);
	}
	
	@Transactional
	public List<notas> muestraNotas() {
		return nsi.muestraNotas();
	}
}
