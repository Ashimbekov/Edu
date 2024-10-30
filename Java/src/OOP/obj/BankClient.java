package OOP.obj;

public class BankClient {
    private int id;
    private String name;
    private String address;
    private int accoundNumber;
    private int cardNumber;

    public BankClient(int id, String name, String address, int accoundNumber, int cardNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.accoundNumber = accoundNumber;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAccoundNumber() {
        return accoundNumber;
    }

    public void setAccoundNumber(int accoundNumber) {
        this.accoundNumber = accoundNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", accoundNumber=" + accoundNumber +
                ", cardNumber=" + cardNumber +
                '}';
    }


}
