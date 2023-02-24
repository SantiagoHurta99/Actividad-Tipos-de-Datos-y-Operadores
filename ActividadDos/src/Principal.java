import javax.swing.JOptionPane;

import Punto_1.Triangulo;
import Punto_2.Formulas;

/**
 * Autor: Santiago Hurtado
 */

public class Principal {
	public static void main(String[] args) {
		boolean ejecutarMenu = true;
		while (ejecutarMenu) {
			int op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1. Punto 1\n2. Punto 2\n3. Punto 3\n4. Salir\n\nIngrese el punto a ejecutar:"));
			switch (op) {
			case 1:
				/**
				 * Escriba un programa que tome la base y altura de un triángulo y calcule y muestre la superficie de este utilizando la fórmula a continuación.
				 */
				int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo:"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo:"));
				Triangulo tr = new Triangulo(base, altura);
				float areaTriangulo = tr.calcularArea();
				JOptionPane.showMessageDialog(null, "El area del triangulo con base: " + base + " y altura: " + altura + " es : " + areaTriangulo);
				break;
				
			case 2:
				/**
				 * Escriba las siguientes fórmulas matemáticas en Java. Tendrá que usar métodos de la clase Math así como una incrustación de métodos y paréntesis 
				 * para forzar el orden de las operaciones y calcular correctamente la respuesta. Suponga que todas  las variables de las fórmulas ya se han declarado e inicializado.
				 */
				Formulas forms = new Formulas();
				String result = "";
				int op2 = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1. Formula a\n2. Formula b\n3. Formula c\n4. Formula d\n5. Formula e\n6. Formula f\n\nIngrese la formula a realizar:"));
				switch (op2) {
				case 1:
					forms.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:")));
					result = forms.formulaA();
					break;
				case 2:
					forms.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:")));
					forms.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y:")));
					result = forms.formulaB();
					break;
				case 3:
					forms.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:")));
					forms.setZ(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de z:")));
					result = forms.formulaC();
					break;
				case 4:
					forms.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:")));
					forms.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y:")));
					result = forms.formulaD();
					break;
				case 5:
					forms.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:")));
					forms.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y:")));
					result = forms.formulaE();
					break;
				case 6:
					forms.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:")));
					result = forms.formulaF();
					break;
				default:
					result = "La opción ingresada no es valida";
					break;
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			case 3:
				/**
				 * Un autobús lleva 45 personas. 
				 * El colegio solo utilizará el autobús si puede llenarlo del todo. 
				 * El resto de personas irá en furgonetas. 
				 * Escriba un programa que registre el número de personas que se han apuntado para ir de viaje. 
				 * Haga que el programa muestre el número necesario de autobuses y, después, el número total de personas que tendrá que viajar en furgonetas.
				 */
				int cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que irán al viaje:"));
				int cantBuses = cantPersonas / 45;
				int cantEnFurgonetas = cantPersonas % 45;
				JOptionPane.showMessageDialog(null, "Total de personas que viajan: " + cantPersonas + "\nTotal de autobuses: " + cantBuses + "\nTotal de personas en furgonetas: " + cantEnFurgonetas);
				break;
			case 4:
				ejecutarMenu = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "La opción ingresada no es valida");
				break;
			}
			
		}
	}
}
