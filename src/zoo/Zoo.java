package zoo;

import java.util.Arrays;

public class Zoo {
	private String nom;
	private Zone[] zones = new Zone[5];

	{
		zones[0] = new Zone("savane africaine");
		zones[1] = new Zone("carnivore");
		zones[2] = new Zone("ferme reptile");
		zones[3] = new Zone("aquarium");
		zones[4] = new Zone("voliere");
		
	}
	public Zoo(String nom) {
		super();
		this.nom = nom;
	}

	public void addAnimal(Animal newAnimal){
		if(newAnimal instanceof Mammifere && newAnimal.getRegimeAlimentaire().equals("carnivore") ) {
			
			zones[1].addNewAnimal(newAnimal);
		}else if(newAnimal instanceof Mammifere && newAnimal.getRegimeAlimentaire().equals("herbivore") ) {
			zones[0].addNewAnimal(newAnimal);
			
		}else if(newAnimal instanceof Reptile) {
			zones[2].addNewAnimal(newAnimal);
			
		}else if(newAnimal instanceof Poisson) {
			zones[3].addNewAnimal(newAnimal);
			
		}else if(newAnimal instanceof Volatile) {
			zones[4].addNewAnimal(newAnimal);
			
		}
	}
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Zone[] getZones() {
		return zones;
	}


	public void setZones(Zone[] zones) {
		this.zones = zones;
	}

	@Override
	public String toString() {
		return "Zoo [nom=" + nom + ", zones=" + Arrays.toString(zones) + "]";
	}

}
