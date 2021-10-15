public class Main {
    public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int price = 17_300;
            int miles = service.calculate(price);
            System.out.println(miles);
        }
    }


