/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueguito;

/**
 *
 * @author Richie
 */
public class ClasePrincipal {
	/**
	 * @author Noruega
	 * @param args
	 */
	public static void main(String args[]) {
		ClaseModelo modelo = new ClaseModelo(); 
		ClaseVista vista = new ClaseVista();

		new ClaseControlador(vista, modelo); 
	} 
}
