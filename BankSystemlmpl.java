/**
 * Created by Катя on 27.11.2016.
 */
public class BankSystemlmpl implements BankSystem {
    public BankSystemlmpl() {
        super();
    }

    @Override
    public void withdrawOfUser(User user, int amount) {
        if(user.getBalance()-amount>=0){
        user.setBalance(user.getBalance()-amount);}
        else System.out.println("ERROR");

    }

    @Override
    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance()+amount);

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if(fromUser.getBalance()-amount>=0){
        fromUser.setBalance(fromUser.getBalance()-amount);
        toUser.setBalance(toUser.getBalance()+amount);}

    }

    @Override
    public void paySalary(User user) {

        user.setBalance(user.getBalance()+user.getSalary());
    }
}
