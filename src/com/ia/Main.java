package com.ia;

public class Main {

    public static void main(String[] args) {
        int beginingNumber = 5;
        int finishNumber = 25;
//        for (int i = beginingNumber; i <= finishNumber; i++) {
//            boolean x = isEvenNumber(i);
//            if (x == true) {
//                System.out.println("Number " + i + "is even");
//            } else {
//                System.out.println("Number" + i + "is odd");
//            }
//        }
        int i = 5;
        while ((i >= beginingNumber) && (i <= finishNumber)) {
            boolean x = isEvenNumber(i);
            if (x == true) {
                System.out.println("Number " + i + "is even");
            } else {
                System.out.println("Number" + i + "is odd");
            }
            i++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}