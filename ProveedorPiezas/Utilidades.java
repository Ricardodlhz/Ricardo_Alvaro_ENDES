package ProveedorPiezas;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Utilidades {
	//AL para piezas
	 public ArrayList<Pieza> leerPiezas(String filename){
		 ArrayList<Pieza> p=new ArrayList<Pieza>();
		 //Leer de un fichero de texto
		 
		 try {
			Scanner entrada=new Scanner(new File(filename));
			String cadena="";
			String [] linea;
			entrada.nextLine();//para saltarnos la cabecera del archivo
			while(entrada.hasNext()) {
				//Leo las lineas
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				p.add(new Pieza(Integer.parseInt(linea[0]), linea[1],Integer.parseInt(linea[2]), Double.parseDouble(linea[3])));
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return p;//AL de piezas
	 }
	 
	 
	 //Al para proveedores
	 public ArrayList<Proveedor> leerProveedores(String filename){
		 ArrayList<Proveedor> p=new ArrayList<Proveedor>();
		 //Leer de un fichero de texto
		 
		 try {
			Scanner entrada=new Scanner(new File(filename));
			String cadena="";
			String [] linea;
			entrada.nextLine();//para saltarnos la cabecera del archivo
			while(entrada.hasNext()) {
				//Leo las lineas
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				p.add(new Proveedor(Integer.parseInt(linea[0]), linea[1], linea[2]));
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return p;//AL de piezas
	 }
	
}
