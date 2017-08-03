package ui;

import java.util.ArrayList;
import java.util.Scanner;
import controlador.CtrlABMCPersona;
import entidades.Persona;

public class ABMCPersonaConsola {
	private Scanner s;
	private CtrlABMCPersona ctrl;
	public ABMCPersonaConsola(){
		s = new Scanner(System.in);
		ctrl = new CtrlABMCPersona();
	}
	
	public void start(){
		String rta="";
		boolean continua=true;
		do {
			System.out.println("\n\n ###############\n");
			System.out.println("¿Qué acción desea realizar? (Ingrese la letra indicada)");
			System.out.println("A - Alta");
			System.out.println("B - Baja");
			System.out.println("M - Modificación");
			System.out.println("C - Consulta");
			System.out.println("S - Salir");
			rta=s.nextLine();
			switch (rta.toLowerCase()) {
			case "a":
				this.alta();
				break;
			case "b":
				this.baja();
				break;
			case "m":
				this.modificacion();
				break;
			case "c":
				this.consulta();
				break;
			case "s":
				continua=false;
			}
		} while (continua);
		s.close();
	}
	
	private void alta(){
		System.out.println("Nueva persona\n\n");
		Persona p = new Persona();
		System.out.println("Ingrese dni: ");
		p.setDni(s.nextLine());
		System.out.println("Ingrese nombre: ");
		p.setNombre(s.nextLine());
		System.out.println("Ingrese apellido: ");
		p.setApellido(s.nextLine());
		System.out.println("Habilitado? s/n");
		String e = s.nextLine();
		if(e.equalsIgnoreCase("S")){
			p.setEstado(true);
		} else if(e.equalsIgnoreCase("N")){
			p.setEstado(false);
		}
		
		ctrl.add(p);
	}
	
	private void baja(){
		System.out.println("Eliminar persona\n\n");
		Persona p = new Persona();
		System.out.println("Ingrese dni: ");
		p.setDni(s.nextLine());
		ctrl.delete(p);
	}
	
	private void modificacion(){
		System.out.println("Modificar persona\n\n");
		Persona p = new Persona();
		System.out.println("Ingrese dni: ");
		p.setDni(s.nextLine());
		this.mostrar(ctrl.getByDni(p));
		
		System.out.println("Ingrese nuevo nombre: ");
		p.setNombre(s.nextLine());
		System.out.println("Ingrese nuevo apellido: ");
		p.setApellido(s.nextLine());
		System.out.println("Habilitado? S/N");
		String h = s.nextLine();
		if(h.equalsIgnoreCase("S")){
			p.setEstado(true);
		} else if(h.equalsIgnoreCase("N")){
			p.setEstado(false);
		}
		ctrl.update(p);
	}
	
	private void consulta(){
		System.out.println("Realizar consulta \n\n");
		Persona p = new Persona();
		System.out.println("1- Mostrar todos");
		System.out.println("2- Buscar por dni");
		System.out.println("3- Buscar por nombre y apellido");
		String rta = s.nextLine();
		switch(rta){
		case "1":
				this.mostrar(ctrl.getAll());
				break;
		case "2":
				System.out.println("Ingrese dni: ");
				p.setDni(s.nextLine());
				this.mostrar(ctrl.getByDni(p));
				break;
		case "3":
				System.out.println("Ingrese nombre: ");
				p.setNombre(s.nextLine());
				System.out.println("Ingrese apellido: ");
				p.setApellido(s.nextLine());
				this.mostrar(ctrl.getByNombreApellido(p));
				break;
		default:
				break;
		}	
		
	}
	
	private void mostrar(ArrayList<Persona> personas){
		for(Persona p:personas){
			mostrar(p);
		}	
	}
	
	public void mostrar(Persona p){
		String h="";
		if(p.isEstado()){
			h = "Habilitado";
		}else {
			h = "No habilitado";
		}
		System.out.println(p.getDni()+" - "+p.getApellido()+", "+p.getNombre()+": "+h);
	}
}
