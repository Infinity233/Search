
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        HashMap<String,Integer> m = new HashMap<>();

        while(true){
            String n = cin.next();
            if(n.equals("noname"))
                break;
            int num = cin.nextInt();
            m.put(n,num);
        }

        String name = cin.next();
        try{
            int s = m.get(name);
            System.out.println(new DecimalFormat(".##").format(s*0.21));
        }
        catch(Exception e){
            System.out.println("Not found.");
        }

    }

}
