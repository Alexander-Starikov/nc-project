/**
 * наследуемый от родительского класса контракт класс контракты проводного интернета
 */

public class ContractInternet extends ContractDefault{
    private int internetSpeed;

    /**
     * объявление конструктора с полями:
     * @param contractID - ID контракта
     * @param startDate - дата начала контракта
     * @param endDate - дата окончания контракта
     * @param contractNumber - номер контракта
     * @param client - объект класса "клиент"
     * @param internetSpeed - скорость соединения
     */
    public ContractInternet(int contractID, String startDate, String endDate, int contractNumber, Client client, int internetSpeed) {
        super(contractID, startDate, endDate, contractNumber, client);
        this.internetSpeed = internetSpeed;
    }

    public void setInternetSpeed(int internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public int getInternetSpeed() {
        return internetSpeed;
    }
}
