package AbstractDemo;

public class Macbook extends  AbsDemo{
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void  termsandcondition(){
        System.out.println("Macbook Conditions");
    }
}
