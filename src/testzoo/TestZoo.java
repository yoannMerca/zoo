package testzoo;


import zoo.Mammifere;
import zoo.Poisson;
import zoo.Reptile;
import zoo.Volatile;
import zoo.Zoo;

public class TestZoo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Zoo zoo = new Zoo("monZOoo");
//		
		
		zoo.addAnimal(new Mammifere("plop","lion" ,Mammifere.ALIMENT_CARNIVORE));
		zoo.addAnimal(new Mammifere("plop2","lion" ,Mammifere.ALIMENT_CARNIVORE));
		zoo.addAnimal(new Mammifere("plop3","gazelle" ,Mammifere.ALIMENT_HERBIVORE));
		zoo.addAnimal(new Poisson("plop4","morue" ,Poisson.ALIMENT_OMNIVORE));
		zoo.addAnimal(new Mammifere("plop5","antilope" ,Mammifere.ALIMENT_HERBIVORE));
		zoo.addAnimal(new Mammifere("plop6","zèbre",Mammifere.ALIMENT_HERBIVORE));
		zoo.addAnimal(new Poisson("plop7","requin",Mammifere.ALIMENT_CARNIVORE));
		zoo.addAnimal(new Reptile("plop8","boa",Mammifere.ALIMENT_CARNIVORE));
		zoo.addAnimal(new Reptile("plop9","anaconda",Mammifere.ALIMENT_CARNIVORE));
		zoo.addAnimal(new Volatile("plop10","poule",Mammifere.ALIMENT_OMNIVORE));
		System.out.println(zoo.toString());

	}

}
