
package exaprac2;

import javax.swing.JOptionPane;

/**
 * Examen REalizado por David Ernesto Peraza Aguillon cod:373218 y
                        Alejandro Ernesto Aguirre Angel cod: 370118
 */
public class ExaPrac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Problema: crear un programa que permita registrar datos de una planilla de trabajadores
("n"trabajadores), por cada empleado se ingresara:Nombre de empleado, salario x hora y
la cantidad de horas trabajadas.
el programa debe mostrar al final por medio de un JOptionPane el detalle de la planilla 
y el total de la planilla. en otro cuadro se mostrara el nombre del empleado que mas gano en esa planilla. **/  
        
int cantemple=0;
double totalplanilla=0;
double numeromayor=0;
String masgano = "";
String detalle="Detalle de Empleados Planillas \n";

cantemple = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Empleados desea Agregar a la Planilla?"));

 
 String nombre[]= new String[cantemple];
 int horastrabajas[]= new int[cantemple];
 double salario[]=new double [cantemple];
 double totalsalario[]=new double [cantemple];
 
 for(int i=0; i<cantemple; i++){
     nombre[i]= JOptionPane.showInputDialog("Nombre de Empleado " + (i+1));
     salario[i]= Double.parseDouble(JOptionPane.showInputDialog("Salario X hora"));
     horastrabajas[i]= Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas"));
     totalsalario[i]= salario[i]* horastrabajas[i];
     totalplanilla += totalsalario[i];
   detalle += "Empleado"+ (i+ 1) + ": " + nombre[i] + "Salario: $ " + totalsalario[i] +  "\n";
   
 }
     for(int m=0; m<totalsalario.length && m<nombre.length; m++){
        if(totalsalario[m]>numeromayor){ 
        numeromayor = totalsalario[m];
        masgano = nombre[m];
    }
}
         
   
 JOptionPane.showMessageDialog(null, detalle + "\n Total de la Planilla es: $" + totalplanilla +"\n EL Empleado que mas gano es: " + masgano);
 
 
    }
    
}
