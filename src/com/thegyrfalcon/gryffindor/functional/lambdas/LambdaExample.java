package com.thegyrfalcon.gryffindor.functional.lambdas;

public class LambdaExample {

    public static void main(String[] args) {
        // Anonymous Inner class
        Greetings aGreetings = new Greetings() {
            @Override
            public void greet() {
                System.out.println("Hello Alice!");
            }
        };

        aGreetings.greet();

        // Simple Lambda Expression
        Greetings greetings = () -> System.out.println("Hello World!!");
        greetings.greet();

        // Lambda Expression with Arguments
        GreetPerson greetPerson = (s) -> System.out.println("Hello, "+ s +" !!");
        greetPerson.greet("Bob");


        // Thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread!!"+ this.getClass());
            }
        });
        thread.run();

        Thread thread2 = new Thread(() -> System.out.println("Running Thread2"));
        thread2.run();

    }

    interface Greetings {
        void greet();

        static void sayHello() {
            System.out.println("Hello...");
        }
    }


    interface GreetPerson {
        void greet(String name);

        static void sayHello() {
            System.out.println("Hello...");
        }
    }
}
