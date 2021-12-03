public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15000;
        int miles = service.calculate(price);
        System.out.println("Вам начислено " + miles + " бонусных миль.");
    }
}