public class Student {
    public void show(int age, String Name) {
        System.out.println("OverRiding 1");
    }

    class StudentAge extends Student {
         @Override
        public void show(int age, String Name) {
            System.out.println("OverRiding two");
        }
    }

    public static void main(String args[]) {
    Student Data = new Student();
    Data.show(10,"izhar");
    }
}