package pres;


import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));


        // Injection des dépendances par instanciation dynamique

        //DaoImpl dao=new DaoImpl();
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();

        //MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        //metier.setDao(dao);
        Method setDao=cMetier.getMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);

        System.out.println("Res="+metier.calcul());


    }
}
