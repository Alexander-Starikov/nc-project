/**
 * наследуемый от родительского класса контракт класс контракты цифрового тв
 */
public class ContractTV extends ContractDefault {
    private int tvChannels;

    /**
     * @param contractID - ID контракта
     * @param startDate - дата начала контракта
     * @param endDate - дата окончания контракта
     * @param contractNumber - номер контракта
     * @param client - объект класса "клиент"
     * @param tvChannels - количество подключенных каналов
     */
    public ContractTV(int contractID, String startDate, String endDate, int contractNumber, Client client, int tvChannels) {
        super(contractID, startDate, endDate, contractNumber, client);
        this.tvChannels = tvChannels;
    }
}