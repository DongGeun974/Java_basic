package chap2;

public class variable {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");

        int value = 10;
        int reult = value + 10;

        System.out.println(reult);

        System.out.println("-----------------------------------------------");

        byte var1 = 125;
        int var2 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            var2++;
            System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
        } 

        System.out.println("-----------------------------------------------");


    }
}
