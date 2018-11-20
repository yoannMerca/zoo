package zoo;

public class Zone {
	private String nom;
	private Animal[] animals;
	
	
	public Zone(String nom, Animal[] animals) {
		super();
		this.nom = nom;
		this.animals = animals;
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
	
	
	
}
