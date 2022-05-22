package chap03;

/**
 * packageName    : chap3
 * fileName       : operation
 * author         : Hwang
 * date           : 2022-05-20
 */

public class operation {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("-----------------------------------------------");
        x++;
        ++x;
        System.out.println("x = " + x);
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        y--;
        --y;
        System.out.println("y = " + y);
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        z = x++;
        System.out.println("z = "+ z);
        System.out.println("x = "+x);
        System.out.println("-----------------------------------------------");

        // same byte code, no diff by speed
        x++;            // ++x
        x=x+1;          // ++x
        ++x;            // ++x

        System.out.println("-----------------------------------------------");

        int v1 = 10;
        int v2 = ~v1;
        int v3 = ~v1+1;

        System.out.println(toBinaryString(v1));
        System.out.println(toBinaryString(v2));
        System.out.println(toBinaryString(v3));

        System.out.println("-----------------------------------------------");

        String str1 = "JDK" + 6.0;
        String str2 = str1 + "특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0;
        String str4 = 3 + 3.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("-----------------------------------------------");

        String strv1 = "java";
        String strv2 = "java";
        String strv3 = new String("java");

        System.out.println(strv1 == strv2);
        System.out.println(strv1 == strv3);
        System.out.println(strv1.equals(strv2));
        System.out.println(strv1.equals(strv3));

        System.out.println("-----------------------------------------------");

    }

    public static String toBinaryString(int value)
    {
        String str = Integer.toBinaryString(value);
        while (str.length() < 32)
        {
            str = "0" + str;
        }
        return str;
    }
}
