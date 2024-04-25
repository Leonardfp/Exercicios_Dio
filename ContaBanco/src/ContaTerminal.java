import java.text.DecimalFormat;

public class ContaTerminal {
    private int num;
    private String Agency;
    private String nameClient;
    private float Money;

    public void setNum(int num) {
        this.num = num;
    }

    public void setAgency(String Agency) {
        this.Agency = Agency;
    }

    public void setnameCliente(String nameCliente) {
        this.nameClient = nameCliente;
    }

    public void setMoney(float Money) {
        this.Money = Money;
    }

    public String getnameCliente() {
        return nameClient;
    }

    public float getMoney() {
        return Money;
    }

    public int getNum() {
        return num;
    }

    public String getAgency() {
        return Agency;
    }

}
