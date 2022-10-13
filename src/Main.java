public class Main
{
    public static void main(String[] args) {
        String Seinfeld = "I mean, what's the";
        String deal = "DEAL with";
        String stuff = "stuff?";
        String and = "and";
        String crap = "crap?";
        String both = stuff.substring(0,5) + " " + and + " " + crap;
        System.out.println(Seinfeld + " " + deal + " " + stuff);
        System.out.println(Seinfeld + " " + deal + " " + crap);
        System.out.println(Seinfeld + " " + deal + " " + both);
        if (both.indexOf(crap) > 1 && both.length() > (crap.length() + stuff.length())) {
            System.out.println("Oh man, I said that already!");
            System.out.println("AUDIENCE: Boo, you suck!");
        }
        String rap = crap.substring(1);
        System.out.println(Seinfeld + " " + deal + " " + rap);
        if (crap.compareTo(rap) < 0) {
            System.out.println("Boy I need new material!");
            System.out.println("AUDIENCE: Get off the stage man!");
        }
    }
}