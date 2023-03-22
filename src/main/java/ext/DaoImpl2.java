package ext;

import dao.IDAO;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDAO{


    @Override
    public double getData() {
        System.out.println("version Capteur");
        double temp=6000;
        return temp;
    }
}
