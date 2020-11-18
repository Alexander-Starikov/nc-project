/**
 * наследуемый от родительского класса контракт класс контракты мобильной связи
 */
public class ContractMobile extends ContractDefault{
    private int mobileMinutes;
    private int mobileInternet;
    private int mobileSMS;

    /**
     *
     * @param contractID - ID контракта
     * @param startDate - дата начала контракта
     * @param endDate - дата окончания контракта
     * @param contractNumber - номер контракта
     * @param client - объект класса "клиент"
     * @param mobileMinutes - количество минут
     * @param mobileInternet - количество трафика интернета
     * @param mobileSMS - количество смс
     */
    public ContractMobile(int contractID, String startDate, String endDate, int contractNumber, Client client,
                          int mobileMinutes, int mobileInternet,int mobileSMS) {
        super(contractID, startDate, endDate, contractNumber, client);
        this.mobileInternet=mobileInternet;
        this.mobileMinutes=mobileMinutes;
        this.mobileSMS=mobileSMS;
    }
}