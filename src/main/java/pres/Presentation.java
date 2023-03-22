package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {

     public static void main(String[] args){
         /*
         injection de dependance par instanciation statique
         */
         DaoImpl2 dao2=new DaoImpl2();
         DaoImpl dao=new DaoImpl();
         IMetierImpl metier=new IMetierImpl();
         metier.setDao(dao2);
         System.out.println("resultat:"+metier.calcul());
     }
}
