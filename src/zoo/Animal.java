package zoo;

abstract class Animal {
	
		protected String nom;
		protected  String type;
		static  final String ALIMENT_CARNIVORE = "carnivore";
		static  final String ALIMENT_HERBIVORE = "herbivore";
		static  final String ALIMENT_OMNIVORE = "omnivore";
		protected String regimeAlimentaire;
		
		protected Animal(String nom, String type, String alimentation) {
			super();
			this.nom = nom;
			this.type = type;
			this.regimeAlimentaire = alimentation;
		}
		
		protected String getRegimeAlimentaire() {
			return regimeAlimentaire;
		}
		protected void setRegimeAlimentaire(String regimeAlimentaire) {
			this.regimeAlimentaire = regimeAlimentaire;
		}
		
		protected String getNom() {
			return nom;
		}


		protected void setNom(String nom) {
			this.nom = nom;
		}


		protected String getType() {
			return type;
		}


		protected void setType(String type) {
			this.type = type;
		}
		
		 
	
}
