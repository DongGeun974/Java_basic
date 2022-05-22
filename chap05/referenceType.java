package chap05;

/**
 * packageName    : chap05
 * fileName       : referenceType
 * author         : Hwang
 * date           : 2022-05-23
 */

public class referenceType {
    public static void main(String[] args) {
        String name1 = "Test";
        String name2 = "Test";

        System.out.println(name1 == name2);
        System.out.println(name1 != name2);

        String name3 = new String("Test");
        String name4 = new String("Test");

        System.out.println(name3 == name4);
        System.out.println(name3 != name4);

        System.out.println(name3);
    }
}
