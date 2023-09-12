package modeladoDatos;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class modeloDatos {
	HashMap<String, ArrayList<String>> mapInformacion;
	public modeloDatos() {
	mapInformacion=new HashMap<String, ArrayList<String>>();
	}
	public HashMap<String, ArrayList<String>> getMapaEstudiantes(){
	return mapInformacion;
	}
	public void guardarDatos(ArrayList<String> listaEstudiantes) {
	mapInformacion.put(listaEstudiantes.get(0), listaEstudiantes);
	JOptionPane.showMessageDialog(null, "Registro existoso!");
	}
	public int getSizeMap() {
	return mapInformacion.size();
	}
	/*
	* Otra forma de imprimir un HashMap
	*/
	public void imprimirMapa() {
	for (String documento:mapInformacion.keySet()) {
	System.out.println(documento + " - "+mapInformacion.get(documento));
	}
	}

}
