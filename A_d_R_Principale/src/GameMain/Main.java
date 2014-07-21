package GameMain;

import jeu.Objectif;
import jeu.Wagon;
import jeu.WagonFermer;
import Controler.Gestionnaire;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wagon piocheWagon = new Wagon();
		WagonFermer wagonFermer = new WagonFermer();
		Objectif piocheObjectif = new Objectif();
		Gestionnaire gestionnaire = new Gestionnaire(piocheWagon, piocheObjectif, wagonFermer );
		gestionnaire.afficheCarteWagon();
		gestionnaire.afficheCarteObjectif();
		gestionnaire.afficheWagonFermer();
	}

}
