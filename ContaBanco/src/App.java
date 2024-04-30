
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String desposito;
        ContaTerminal cont = new ContaTerminal();
        System.out.println("Please, Write the agency number !");
        cont.setAgency(sc.nextLine());
        System.out.println("Account Number");
        cont.setNum(sc.nextInt());
        sc.nextLine();
        System.out.println("User:");
        cont.setnameCliente(sc.nextLine());
        System.out.println("Deseja fazer um desposito?? [S]/[N]");
        desposito = sc.nextLine();
        if (desposito.equalsIgnoreCase("S") || desposito.equalsIgnoreCase("Sim")) {
            System.out.println("Deseja depositar quanto?: ");
            cont.setMoney(sc.nextFloat());
        }
        sc.close();
        System.out.println("Hello user " + cont.getnameCliente()
                + ", Thank you for create a account in our bank, you agencer is " + "0" +
                cont.getAgency()
                + " Account " + cont.getNum() + " and your balance $" + cont.getMoney());

    }
}
