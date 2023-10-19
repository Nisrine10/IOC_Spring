package dao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double data=55;
        return data;
    }
}
