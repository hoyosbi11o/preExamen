package modeladoDatos;

import javax.swing.JOptionPane;

public class prePrincipal {

	public prePrincipal() {
		Object desplegable=JOptionPane.showInputDialog(null,"Desea ver el ejercicio" , "MENU", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Seleccione","#1","#2","#3","Salir"},"Seleccione");
		String desplegables=String.valueOf(desplegable);
		switch (desplegables) {
		case "#1":
			procesos miuno=new procesos();
			break;
		case "#2":
			procesosDos midos=new procesosDos();
			break;
		case "#3":
			procesoTres mitres=new procesoTres();
			break;
		case "Salir":
			JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
			break;

		default:
			break;
		}
	
	}

}
