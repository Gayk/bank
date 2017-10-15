package pl.gaik.bank.models.forms;

/**
 * Created by monik on 14.10.2017.
 */
public class CreditForm {
    private int salary;
    private int costs;
    private int credit;
    private int period;

    public CreditForm(int salary, int costs, int credit, int period) {
        this.salary = salary;
        this.costs = costs;
        this.credit = credit;
        this.period = period;
    }

    public CreditForm() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "CreditForm{" +
                "salary=" + salary +
                ", costs=" + costs +
                ", credit=" + credit +
                ", period=" + period +
                '}';
    }
}
