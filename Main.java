
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Bank bank = new Bank();
        int p=1000;
        int t=4;
        
        System.out.println("Interest with explicit rate (7%):"+ bank.calculateInterest(p,t, 7));
        System.out.println("Interest with default rate:"+ bank.calculateInterest(p,t));
    }
}
