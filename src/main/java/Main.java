/**
 * репозиторий
 */
public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(12345, "a b", "m", "19991026", 1513134734);
        Client client2 = new Client(12346, "a b", "m", "19991026", 1513134734);
        Client client3 = new Client(12347, "a b", "m", "19991026", 1513134734);

        ContractInternet contractInternet1 = new ContractInternet(12334, "20201130", "20210230", 1, client1, 100);
        ContractMobile contractMobile1 = new ContractMobile(13234, "20201130", "20210323", 1, client2, 10,10,10);
        ContractTV contractTV1 = new ContractTV(12332, "20201130", "20210230", 1, client3, 100);


        /**
         * динамический массив, который хранит контракты
         */
        MyArrayList<ContractDefault> listContracts = new MyArrayList<ContractDefault>();


        listContracts.add(contractInternet1);
        listContracts.add(contractMobile1);
        listContracts.add(contractTV1);
        System.out.println(findContract(listContracts, 12332));
        deleteContract(listContracts, 12332);
        System.out.println(findContract(listContracts,12332));
    }

    /**
     * метод поиска контракта по ID контракта
     * @param listContracts - место хранения контрактов
     * @param contractID - ID контракта
     * @return - возвращает контракт с искомым ID
     */
    public static Object findContract(MyArrayList<ContractDefault> listContracts, int contractID){
        for (int i = 0; i < listContracts.size(); i++) {
            if (listContracts.get(i).getContractID() == contractID) {
                return listContracts.get(i);
            }
        }   return null;
    }

    /**
     * метод удаления контракта по ID контракта
     * @param listContracts - место хранения контрактов
     * @param contractID - ID контракта
     */
    public static void deleteContract(MyArrayList<ContractDefault> listContracts, int contractID){
        for (int i = 0; i < listContracts.size(); i++) {
            if (listContracts.get(i).getContractID() == contractID) {
                listContracts.remove(i);
            }
        }
    }
}
