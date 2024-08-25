package oops;
public class Polymorphism {
    public static void main(String[] args) {
        class Bank {
            float getRoi() {
                return 0;
            }
        }
        class SBI extends Bank {
            float getRoi() {
                return 8.4f;
            }
        }
        class Axis extends Bank {
            float getRoi() {
                return 11.6f;
            }
        }
        class HDFC extends Bank {
            float getRoi() {
                return 18.0f;
            }
        }

        SBI obj_Sbi = new SBI();
        System.out.println("Return on investment in State Bank of India is " + obj_Sbi.getRoi());

        Axis objAxis = new Axis();
        System.out.println("Return on investment in State Bank of India is " + objAxis.getRoi());

        HDFC objHdfc = new HDFC();
        System.out.println("Return on investment in State Bank of India is " + objHdfc.getRoi());

        // Runtime Polymorphism

        // Here, firstly we are defining a parent class Bike.
        class Bike {
            // Here, we are defining a method called 'run'.
            void run() {
                System.out.println("Bike runs.");
            }
        }

        // Here, we are defining a child class 'Apache' and extending/using/inheriting
        // the properties of parent class
        class Apache extends Bike {
            // Here, we are using the function defined in the parent class Bike and
            // modifying the value.
            void run() {
                System.out.println("Apache runs @70 km/hr");
            }
        }

        // Now we are creating an object of Apache class using the reference variable
        // Apache_160r which is basically requiring the run method in the Bike class and
        // then points as an object to Apache class and print the data stored inside the
        // function used in the Apache class
        Bike Apache_160r = new Apache();
        Apache_160r.run();
    }

}
