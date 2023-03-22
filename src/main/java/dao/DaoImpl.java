package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDAO {

    @Override
    public double getData() {
        /*
        Se connecter a la base de donne recupere la temperature
        */
        System.out.println("Version base de donne");
        double temp=Math.random()*40;
        return temp;
    }
}
