package empolyee;

public class Salary {

    private int pay;
    private int name;

    private static int payment = 600;

    public void employee (int name){
        pay = +payment;
        this.name = name;
    }

    public static void printID(){
        System.out.println(payment);
    }

    public int Hourly() {
        return pay;
    }

    public void setPay(int pay) {
        this.employee(1);
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}










