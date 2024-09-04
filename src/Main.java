public class Main {
    public static void main(String[] args) {
        int price = 35067;
        int mile = 20;
        int bonus;

        bonus = price / mile;
        System.out.println("При покупке билета стоимостью " + price + " начисляются бонусные мили в количестве " + bonus + " шт");
    }
}