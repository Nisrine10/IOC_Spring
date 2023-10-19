package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringAnnot {
    public static void main(String[] args) {
        ApplicationContext context=
                new AnnotationConfigApplicationContext("dao","metier") ;
        IMetier metier=(IMetier) context.getBean(IMetier.class);
        System.out.println("Result= "+metier.calcul());
    }
}
