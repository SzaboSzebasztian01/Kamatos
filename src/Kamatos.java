import java.util.Scanner;

public class Kamatos {

    public Kamatos() {

    }

    public void startKamatos(){
        double tenyleges = this.bekerdata();
        nyomtat(tenyleges);

    }

    private void nyomtat(double tenyleges){
        System.out.println(tenyleges);

    }

    private double bekerdata(){
        String betetStr = beker("Betét: ");
        String nevlegesStr = beker("Névleges kamat (%): ");
        String tokesites_szamStr = beker("Évenkénti tőkésítési szám: ");

        double betet = Double.parseDouble(betetStr);
        double nevleges = Double.parseDouble(nevlegesStr);
        double tokesites_szam = Double.parseDouble(tokesites_szamStr);
        Double tenyleges = this.szamitTenylegesKamat(betet, nevleges, tokesites_szam);
        
        return tenyleges;

    }
    
    private String beker(String msg){
        Scanner scanner = new Scanner(System.in);

        System.out.println(msg);

        return scanner.nextLine();

    }

    public double szamitTenylegesKamat(double betet, double nevleges, double tokesites_szamStr){
        double tenyleges = (Math.pow((1+ (nevleges / (100 * tokesites_szamStr))), tokesites_szamStr) -1) * betet;
        
        return tenyleges;

    }

    public boolean checkInput(String input){

        if (input.matches("[0-9.,]+")) {
            return true;        
                
        }else{
            return false;

        }
    }

}
