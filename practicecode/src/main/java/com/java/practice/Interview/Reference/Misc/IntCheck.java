package com.java.practice.Interview.Reference.Misc;

public class IntCheck {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        Integer x = 10;
        Integer y = 10;
        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}

class FinalTest {
    private static volatile FinalWrapper wrapper;

    public static void main(String[] args) throws InterruptedException {
        Thread writer = new Thread(() -> {
            synchronized (FinalTest.class) {
                wrapper = new FinalWrapper();
            }
        });
        Thread reader = new Thread(() -> {
            FinalWrapper w = wrapper;
            System.out.println(w);
            if (w != null) {
                System.out.println(w.number);
            } else {
                System.out.println("Wrapper is null");
            }
        });
        writer.start();
        reader.start();
        writer.join();
        reader.join();
    }

    static class FinalWrapper {
        final int number;

        FinalWrapper() {
            this.number = 42;
        }
    }
}
