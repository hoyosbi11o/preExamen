package modeladoDatos;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class procesosDos {

    public procesosDos() {

        iniciarDos();
        }

    private void iniciarDos() {
        int ingreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea en los dos arreglos"));
        int array[]=new int [ingreso];
        int arrayDos[]=new int [ingreso];
        int arrayTres[]=new int [ingreso];



        for (int i = 0; i < array.length; i++) {

            array[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la posicion "+ i +" del primer arreglo"));
            arrayDos[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la posicion "+ i +" del segundo arreglo"));

                    };


        for (int i = 0; i < ingreso; i++) {
            arrayTres[i]=array[i]+arrayDos[i];
        }

            System.out.println("Los primeros numeros ingresados "+Arrays.toString(array));
           System.out.println("Los segundos numeros ingresados "+Arrays.toString(arrayDos));
          System.out.println("El resultado de la suma "+Arrays.toString(arrayTres));


    }




    }