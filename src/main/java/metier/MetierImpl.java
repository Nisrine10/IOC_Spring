package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //injection via annotation autowired
   // @Autowired
    //injection via constructeur
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res=data*33;
        return res;
    }


     // Pour Injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
