package week_04;
/*
Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4
 */
public class CalculateCarTax_task05 {
    public static void main(String[] args) {

        int price = 80000;
        double tax = 10000;

        if (price >= 20000 && price <= 80000) {
            if (price >= 20000 & price <= 39999) {
                tax = price * 0.2;
            } else if (price >= 40000 & price <= 59999) {
                tax = price * 0.3;
            } else if (price >= 60000 & price <= 80000) {
                tax = price * 0.4;
            }


        } else {
            System.out.println("invalid price");
        }
        System.out.println("tax= " + tax);
    }
}
