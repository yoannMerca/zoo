package zoo;

import java.util.Arrays;

public class Zone {
	private String nom;
	private Animal[] animals;
	
	

	public Zone(String nom) {
		super();
		this.nom = nom;
		this.animals = null;
	}

	@Override
	public String toString() {
		
		return "Zone [nom=" + nom + ", animals=" + Arrays.toString(animals) + "]\n\r";
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Animal[] getAnimals() {
		return animals;
	}


	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}
	
	public void addNewAnimal(Animal newAnimal) {
		
		if(animals==null) {
			animals = new Animal[1];
			animals[0] = newAnimal; 
		}else {
			Animal[] newAnimals = new Animal[animals.length+1];
			int i=0;
			for (Animal animal : animals) {
				newAnimals[i] = animal;
				i++;
			}
			newAnimals[animals.length] = newAnimal;
			this.animals = newAnimals;
		}
		
	}
	
	
	
}
