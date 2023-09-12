package modeladoDatos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class procesos {

	modeloDatos miData;
	ArrayList<String> listaRegistro;
	int Mayoresss=0,Menoresss=0;
	
	public procesos() {
		miData=new modeloDatos();
		iniciar();
		}

	private void iniciar() {
		String desplegabless;
     do {
    	 
    	 Object desplegable=JOptionPane.showInputDialog(null,"Desea",
				   " ", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Registrar Personas", "Total Registros", "Mayores De Edad", "Menores De Edad","Salir" },"Seleccione");
		 desplegabless=String.valueOf(desplegable);
		switch (desplegabless) {
		case "Registrar Personas":
			int cant = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de personas que desea registrar"));
			
			for (int i = 0; i < cant; i++) {
				IngresarDatos();
			}

			break;
			
     case "Total Registros":
			int total=miData.getSizeMap();
			
			System.out.println("El total de personas registradas es: "+total);
			break;
			
     case "Mayores De Edad":
			System.out.println("El total de personas mayores de edad son: "+Mayoresss);
			break;
			
     case "Menores De Edad":
			System.out.println("El tptal de personas menores de edad son: "+Menoresss);
			break;
     case "Salir":
			break;
		default:
			break;
		}
	} while (desplegabless!="Salir");
		
	}

	private void IngresarDatos() {
       
		listaRegistro=new ArrayList<String>();
		
		String nombre = JOptionPane.showInputDialog("Ingrese El Nombre");
		String documento = JOptionPane.showInputDialog("Ingrese el documento");
		String edad = validarEdad();
		String profesion = JOptionPane.showInputDialog("Ingrese la profesion");
		
		listaRegistro.add(nombre);
		listaRegistro.add(documento);
		listaRegistro.add(edad);
		listaRegistro.add(profesion);
		
		miData.guardarDatos(listaRegistro);
		
		System.out.println("Nombre: "+nombre+", Documento: "+documento+", Edad: "+edad+" Profesion "+profesion);


	}

	private String validarEdad() {

         int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
         
         if (edad >=18) {
			
        	 Mayoresss++;
        	 
		} else {
			Menoresss++;
		}
         
         String edadtodos = String.valueOf(edad);
		
		return edadtodos;
	}
	
}