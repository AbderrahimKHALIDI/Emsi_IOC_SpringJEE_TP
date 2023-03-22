package metier;

import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    @Autowired
    @Qualifier("dao")
    private IDAO dao;
  // public IMetierImpl(IDAO dao){
    //   this.dao=dao;
   //}
/*  injecte dans la variable dao un objet d'une class qui implement l'interface de Idao */
    public void setDao(IDAO dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp= dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);

        return res;
    }

}
