//package stunda2;

public class Main {

    public static void main(String[] args) {
        batter();
        sum("DJ", "Sigma");
        sum(1, 2);
        sum(1, 2, 3);
    }
    public static void sum(int a, int b){
        int rez = a + b;
        System.out.println("Skaitļu summa ir " + rez);
    }
    public static void sum(int a, int b, int c){
        int rez = a + b + c;
        System.out.println("Skaitļu summa ir " + rez);
    }
    public static void sum(String a, String b){
        String rez = a + b;
        System.out.println("Skaitļu summa ir " + rez);
    }
    public static void batter() {
        //        1	Make the cookie batter.
        System.out.println("Mix the dry ingredients.");
        System.out.println("Cream the butter and sugar.");
        System.out.println("Beat in the eggs.");
        System.out.println("Stir in the dry ingredients.");
    }
    public static void bake(){
        //        2	Bake the cookies.
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
    }
    public static void frosting(){
        //        3	Add frosting and sprinkles.
        System.out.println("Mix ingredients for frosting.");
        System.out.println("Spread frosting and sprinkles.");
    }
}