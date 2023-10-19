package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {

        // Injection des dépendances par instanciation statique

        DaoImpl dao=new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);//le parametre dao s'ajoute avec le constructeur de l'injection
       // metier.setDao(dao); //S'active avec l'injection via autowired

        System.out.println("res="+metier.calcul());
    }
}
