package modeladoDatos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class procesoTres {
	
	modeloDatos miData;
	ArrayList<String> listaEmpleados;

public procesoTres() {
		miData=new modeloDatos();
		iniciarTres();
		}

private void iniciarTres() {
	String desplegables;
    do {
   	 
   	 Object desplegable=JOptionPane.showInputDialog(null,"Seleccione la accion que desea realizar",
				   "Procedimiento", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Registrar empleado", "Registro descuentos","Salir" },"Seleccione");
		 desplegables=String.valueOf(desplegable);
		switch (desplegables) {
		case "Registrar empleado":
				IngresarDatos();
			break;
			
    case "Registro descuentos":
			int total=miData.getSizeMap();
			
			System.out.println("El Total De Descuentos Hechos Es: "+total+"\n");
			
			miData.imprimirMapa();
			
			
			break;
			

		default:
			break;
		}
	} while (desplegables!="Salir");
 }

public void IngresarDatos() {
	
	listaEmpleados=new ArrayList<String>();
	
	String nombre = JOptionPane.showInputDialog("Ingrese El Nombre");
	int estracto = validarEstracto();
	double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
	
	double descuentoEntotal = descuento(estracto,salarioBase);
	
	double salarioFinales = salarioBase - descuentoEntotal;
	
	String estractoS = String.valueOf(estracto);
	String salarioBasico = String.valueOf(salarioBase);
	String descuentoS = String.valueOf(descuentoEntotal);
	String salarioFinal = String.valueOf(salarioFinales);
	
	
	
	listaEmpleados.add(nombre);
	listaEmpleados.add(estractoS);
	listaEmpleados.add(salarioBasico);
	listaEmpleados.add(descuentoS);
	listaEmpleados.add(salarioFinal);

	miData.guardarDatos(listaEmpleados);
	

	
}

public int validarEstracto() {
	int estracto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estracto"));
	
	while (estracto <0 && estracto >7) {
		System.out.println("estracto no valido");
		
		estracto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estracto"));
	}
		
		
	
		return estracto;
	
}

public double descuento(int estracto, double salario) {
	
	double valorD = 0;
	
	
	
	  if (estracto >=1 && estracto <=2 ) {
	        valorD = 0.02 * salario ;

	    } else if(estracto >=3 && estracto <=4 ) {
	        valorD = 0.04*salario ;
	    } else if(estracto == 5 ) {
	        valorD = 0.08*salario ;
	}else if(estracto ==6 ) {
	    valorD =0.1*salario ;
	}
	  return valorD;
	    }

  

	
}
