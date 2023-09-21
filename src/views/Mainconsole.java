package views;


public class Mainconsole {
    public Mainconsole (){

    }
    public void showSalarySum(double sum){
        String prefix = "Dolgozók fizetésének összege: ";
        System.out.printf("%s %f\n" , prefix, sum);
    }
}
