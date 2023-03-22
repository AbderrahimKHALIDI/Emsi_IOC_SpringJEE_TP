package ext;

import dao.IDAO;

public class DaoImplWS implements IDAO {

    @Override
    public double getData() {
        System.out.println("Version web service");
        return 90;
    }
}
