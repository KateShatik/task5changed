/**
 * Created by Катя on 27.11.2016.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD:
                return 2000;
            case EUR:
                return 2200;
            default:
                return 0;
        }

    }

    @Override
    int getMonthlyRate() {
        switch (getCurrency()){
            case USD: return 0 ;
            case EUR: return 1;
            default: return 0;
        }
    }

    @Override
    int getCommission(int summ) {
        if (summ < 1000) {
            switch (getCurrency()) {
                case USD:
                    return 5;
                case EUR:
                    return 2;
                default:
                    return 0;
            }
        }
        if (summ > 1000) {
            switch (getCurrency()) {
                case USD:
                    return 7;
                case EUR:
                    return 4;
                default:
                    return 0;
            }
        }
        return 0;
    }
    @Override
    int getLimitOfFunding() {

        switch (getCurrency()) {
            case USD:
                return 10000;
            case EUR:
                return 20000;
            default:
                return 0;
        }

    }
}
