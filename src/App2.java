public class App2 {
    public static void main(String[] args) {
        Pies pies = new Pies();
        pies.name = "Czarek";
        pies.race = "Kundel";

        System.out.println(pies.name);
        System.out.println(pies.race);

        Pies pies2 = new Pies();
        pies2.name = "Max";
        pies2.race = "Sznaucer";

        System.out.println(pies2.name);
        System.out.println(pies2.race);

        System.out.println(pies.name);
        System.out.println(pies.race);
    }
}
