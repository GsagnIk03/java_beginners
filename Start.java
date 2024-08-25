package getter_setter;
public class Start {
    public static void main(String[] args) {
        class Person {
            // Here, we are defining a private variable
            private String name;

            // Here, in order to use the private variable we are creating getter which looks
            // like this below [Demonstration : first the access specifier is being used
            // Public to make the method available across the codes whenever an object
            // against Person class is invoked. That method is returning the same private
            // variable as String because that's what the return type is set.]

            public String getName() { // Getter Function/Method
                return name;
            }

            // Here, we are setting the value of the name which is being taken like a
            // parameter using newName variable and getting set inside the name private
            // variable using this keyword which is acting like a current class object.

            public void setName(String newName) { // Setter Function/Method
                this.name = newName;
            }
        }

        // Here, we are creating an object of the Person class so that all the methods &
        // variables inside the class get accessible.

        Person obj_Person = new Person(); // Object creation

        // Here, as mentioned in line no. 12, we are passing the String as an
        // argument/parameter of the setName method.

        obj_Person.setName("Arpan Kundu"); // Calling the setter function/method using the object of that class

        // Here, we are getting the name which was being passed in line no. 22 by using
        // getName() method. the definition of this function/method was written in line
        // no.8 & the demonstration was provided in line no. 7

        System.out.println(obj_Person.getName()); // Calling the getter function/method using the object of that class &
                                                  // printing the value on the terminal/console.

        // The same explanation & definiton inside this AllFriends class to see an
        // extensive usage of these things. If anything is not understood please refer
        // to the explanations/declarations being done on the top.
        class AllFriends {
            private String name;
            private int age;
            private String company;

            public String getName() {
                return name;
            }

            public void setName(String newPersonName) {
                this.name = newPersonName;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int newAge) {
                this.age = newAge;
            }

            public String getCompany() {
                return company;
            }

            public void setCompany(String newCompany) {
                this.company = newCompany;
            }
        }

        AllFriends Tuhin = new AllFriends();
        AllFriends Arghyadip = new AllFriends();
        AllFriends Sumit = new AllFriends();

        Tuhin.setName("Tuhin Sil");
        Tuhin.setAge(24);
        Tuhin.setCompany("Kotak Mahindra");

        Arghyadip.setName("Arghyadip Ghosh");
        Arghyadip.setAge(22);
        Arghyadip.setCompany("RedoQ LTD.");

        Arghyadip.setName("Arghyadip Ghosh");
        Arghyadip.setAge(22);
        Arghyadip.setCompany("RedoQ LTD.");

        Sumit.setName("Sumit Das");
        Sumit.setAge(23);
        Sumit.setCompany("CA Firm");

        System.out.println("My first friend is " + Tuhin.getName() + ", age is " + Tuhin.getAge() + " & works in "
                + Tuhin.getCompany() + ".");
        System.out.println("My second friend is " + Arghyadip.getName() + ", age is " + Arghyadip.getAge()
                + " & works in " + Arghyadip.getCompany());
        System.out.println("My third friend is " + Sumit.getName() + ", age is " + Sumit.getAge() + " & works in "
                + Sumit.getCompany() + ".");
    }
}