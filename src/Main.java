public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketCost = 10_321;
        int miles = service.calculate(ticketCost);
        System.out.println("Вам начислено " + miles + " бонусных миль");
    }
}

