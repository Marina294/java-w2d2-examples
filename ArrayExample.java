public class ArrayExample {

    public static void main(String[] args) {

        // long way to do things
        int myList[] = new int[5]; // [0, 0, 0, 0, 0]

        System.out.println(myList[4]);

        myList[0] = 3;
        myList[1] = 5;
        myList[2] = 6;
        myList[3] = 19;
        myList[4] = 100;

        System.out.println(myList[3]);

        int[] myListTwo = {3, 5, 6, 19, 100};

        for (int i = 0; i < myListTwo.length; i++) {
           System.out.println(myListTwo[i]);

           myListTwo[i] = myListTwo[i] + 5000;

           System.out.println(myListTwo[i]);
        };


    }


}