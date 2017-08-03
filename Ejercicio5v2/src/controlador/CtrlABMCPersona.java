package controlador;

import entidades.Persona;
import java.util.ArrayList;

public class CtrlABMCPersona {
	
	
	private ArrayList<Persona> pers;
	
	public CtrlABMCPersona(){
		pers = new ArrayList<Persona>();
		pers.add(new Persona("Juan", "Perez", "12312312", true));
		pers.add(new Persona("Pedro", "Gomez", "34534534", false));
	}
	
	public void add(Persona p){
		this.pers.add(p);
	}
	
	public void delete(Persona p){
		this.pers.remove(p);
	}
	
	public void update(Persona p){
		this.delete(p);
		this.add(p);
	}
	
	public Persona getByDni(Persona p){
		return this.pers.get(this.pers.indexOf(p));
		//return this.getByDni(p.getDni());
	}
	
	public Persona getByDni(String dni){

		Persona p= new Persona();
		p.setDni(dni);
		return getByDni(p);
	}
	
	public Persona getByNombreApellido(Persona p){
		
		for (int i=0; i < this.pers.size(); i++){
			if(pers.get(i).getNombre().equalsIgnoreCase(p.getNombre())
				&& pers.get(i).getApellido().equalsIgnoreCase(p.getApellido())) {
				return pers.get(i);		
			}
		}
		return null;
	}

	public ArrayList<Persona> getAll(){
		return this.pers;
	}
}
