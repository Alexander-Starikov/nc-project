/**
 * класс с описанием родительского класса контрактов
 */

public class ContractDefault {
    private int contractID;
    private String startDate;
    private String endDate;
    private int contractNumber;
    private Client client;

    /**
     * объявление конструктора с полями:
     * @param contractID - ID контракта
     * @param startDate - дата начала контракта
     * @param endDate - дата окончания контракта
     * @param contractNumber - номер контракта
     * @param client - объект класса "клиент"
     */

    public ContractDefault(int contractID, String startDate, String endDate, int contractNumber, Client client){
        this.contractID=contractID;
        this.startDate=startDate;
        this.endDate=endDate;
        this.contractNumber=contractNumber;
        this.client=client;
    }

    /**
     * геттер ID контракта
     * @return - ID контракта
     */
    public int getContractID() {
        return contractID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}