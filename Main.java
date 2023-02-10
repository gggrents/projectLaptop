import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, what do you want?");
        Scanner sc = new Scanner(System.in);
        ArrayList<Laptop> l = new ArrayList<>();
        int n;
        String str;
        Double dbl;
        while (true)  {
            Menu.showMenu();
            n = sc.nextInt();
            if (n<1 || n>5) {
                System.out.println("Mistake");
            }
            else if (n==1) {
                l.add(Menu.createLaptop());
            }
            else if (n==2) {
                for (Laptop laptop : l) {
                    laptop.ToString();
                }
            }
            else if (n==3) {
                for (Laptop laptop : l) {
                    laptop.ToString();
                }
                System.out.println("Write the ID of the laptop you would like to change");
                n = sc.nextInt();
                l.set(n-1, Menu.createLaptop());
                l.get(n-1).setId(n);
            }
            else if (n==4) {
                System.out.println("Write the ID of the laptop you would like to delete");
                n = sc.nextInt();
                l.remove(n-1);
            }
            else if (n==5) {
                break;
            }
            }

        }
    }
