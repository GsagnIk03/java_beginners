package getter_setter;
public class sample {
    public static void main(String[] args) {
        class test {
            private String name;
            private int age;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getAge() {
                return age;
            }
        }

        test objTest = new test();

        objTest.setName("Alex Hales");
        objTest.setAge(23);

        System.out.println("My ex's name is " + objTest.getName() + " and age is " + objTest.getAge() + ".");
    }
}
