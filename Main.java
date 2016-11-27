/**
 * Created by Катя on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(11,"US",Currency.USD,1000000,7000,10,100000000);
        Bank euBank = new EUBank(11,"Swiss",Currency.EUR,1000000,17000,5,100000000);
        Bank chinaBank = new ChinaBank(11,"China",Currency.USD,10000,700,20,10000);
        User user1= new User(11,"Olga",1000,10,10000,"Apple",usBank);
        User user2= new User(101,"Mark",179000,10,1003200,"Apple",usBank);
        User user3= new User (102,"Masha",1200,10,10030,"Sony",euBank);
        User user4= new User(102,"Sasha",1200,10,10030,"Sony",euBank);
        User user5= new User(11,"Ohha",1000,10,10000,"Apple",chinaBank);
        User user6= new User(11,"Ollla",1000,10,10000,"Apple",chinaBank);

        BankSystemlmpl withdraw = new BankSystemlmpl();
        withdraw.withdrawOfUser(user1,100);
        withdraw.withdrawOfUser(user2,500);
        withdraw.withdrawOfUser(user3,300);
        withdraw.withdrawOfUser(user4,200);
        withdraw.withdrawOfUser(user5,700);
        withdraw.withdrawOfUser(user6,100);
        BankSystemlmpl fund = new BankSystemlmpl();
        fund.fundUser(user1,100);
        fund.fundUser(user2,500);
        fund.fundUser(user3,300);
        fund.fundUser(user4,200);
        fund.fundUser(user5,700);
        fund.fundUser(user6,100);
        BankSystemlmpl transfer = new BankSystemlmpl();
        transfer.transferMoney(user1,user2,100);
        transfer.transferMoney(user2,user4,500);
        transfer.transferMoney(user3,user1,300);
        transfer.transferMoney(user4,user5,200);
        transfer.transferMoney(user5,user2,700);
        transfer.transferMoney(user6,user3,100);
        BankSystemlmpl salary = new BankSystemlmpl();
        salary.paySalary(user1);
        salary.paySalary(user2);
        salary.paySalary(user3);
        salary.paySalary(user4);
        salary.paySalary(user5);
        salary.paySalary(user6);

    }
}
