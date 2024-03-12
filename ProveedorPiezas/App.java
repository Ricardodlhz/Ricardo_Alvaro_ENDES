package ProveedorPiezas;

import java.io.*;
import java.util.ArrayList;

public class App {
	private ArrayList<Pieza> piezas;
	private ArrayList<Proveedor> prov;
	
	public App() {
		this.piezas=new ArrayList<Pieza>();
		this.prov=new ArrayList<Proveedor>();
	}

	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}

	public void setPiezas(ArrayList<Pieza> piezas) {
		this.piezas = piezas;
	}

	public ArrayList<Proveedor> getProv() {
		return prov;
	}

	public void setProv(ArrayList<Proveedor> prov) {
		this.prov = prov;
	}
	
	public void generarFicheros(String filename) {
		try {
			PrintWriter salida=new PrintWriter(new File(filename));
			for(Proveedor prov: this.getProv()) {
				salida.println("El proveedor "+prov.getNombreProveedor()+" de "+prov.getLocalidad()+
						" suministra: ");
				for(Pieza p:this.getPiezas()) {
					if(prov.getCodProveedor()==p.getProveedor()) {
						salida.println("\t *"+p.getNombrePieza().substring(0,1).toUpperCase()+p.getNombrePieza().substring(1));
					}
					
				}
						
			}//for
			
			salida.flush();
			salida.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		App app=new App();
		Utilidades u=new Utilidades();
		app.setPiezas(u.leerPiezas("piezas.csv"));
		app.setProv(u.leerProveedores("proveedor.csv"));
		app.generarFicheros("proveedoresPiezas.txt");
		
//		for(Pieza p: app.getPiezas()) {
//			System.out.println(p);
//		}
//		
//		for(Proveedor prov: app.getProv()) {
//			System.out.println(prov);
//		}
		
	}
	
}
