import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * Класс с описанием клиента
 */
public class Client {
    private int clientID;
    private String clientFullname;
    private String clientgender;
    private String clientBirthday;
    private int clientPassportID;

    /**
     * Объявление конструктора клиента
     *  @param clientID - поле с ID клиента
     *  @param clientFullname - поле с его полным именем
     *  @param clientgender  - пол клиента
     *  @param clientBirthday - день рождения клиента в формате ггггММдд
     *  @param clientPassportID - поле с серией и номером паспорта клиента
     **/
    public Client(int clientID, String clientFullname, String clientgender, String clientBirthday, int clientPassportID){
        this.clientID=clientID;
        this.clientFullname=clientFullname;
        this.clientgender=clientgender;
        this.clientBirthday=clientBirthday;
        this.clientPassportID=clientPassportID;
    }

// пока что для инициализации клиента нужно вводить дату в формате yyyyMMdd, ну и тип данных String

    /**
     * метод, который принимает день рождения клиента и возвращает его нынешний возраст
     * @param clientBirthday - день рождения
     * @return - возвращает age - возраст
     */
    public int clientGetAge(String clientBirthday) {
        int date1 = Integer.parseInt(clientBirthday);
        DateFormat formatForDateNow = new SimpleDateFormat("yyyyMMdd");
        Date dateNow = new Date();
        int date2 = Integer.parseInt(formatForDateNow.format(dateNow));
        int age = (date2 - date1)/10000;
        return age;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientFullname() {
        return clientFullname;
    }

    public void setClientFullname(String clientFullname) {
        this.clientFullname = clientFullname;
    }

    public String getClientgender() {
        return clientgender;
    }

    public void setClientgender(String clientgender) {
        this.clientgender = clientgender;
    }

    public String getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(String clientBirthday) {
        this.clientBirthday = clientBirthday;
    }

    public int getClientPassportID() {
        return clientPassportID;
    }

    public void setClientPassportID(int clientPassportID) {
        this.clientPassportID = clientPassportID;
    }
}
