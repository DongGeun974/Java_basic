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

        System.out.println("-----------------------------------------------");

        int[] intArr;
        String[] strArr;

        int arrInt[];
        String arrStr[];

        String name[] = {"test"};

        System.out.println(name[0]);

//        intArr = {1, 2};
        intArr = new int[] {1, 2};
        System.out.println(intArr[0]);

        int scores[][] = new int[2][3];
        System.out.println(scores.length);
        System.out.println(scores[0].length);

        int s[][] = {{1,2}, {3,4}};

        for (int score : s[0])
        {
            System.out.println(score);
        }

        System.out.println("-----------------------------------------------");

        Week today = Week.Mon;
        System.out.println(today.getClass().getName());
    }

    public enum Week {Mon, Tue, Wed, Thu, Fri}
}
