public class BonusMilesService {

    public int calculate(int ticketCost) {
        int rublesForMiles = 20;
        int miles = ticketCost / rublesForMiles;
        return miles;
    }
}