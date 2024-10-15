public class main {

  public static void main(String[] args) {

    Student a = new Student("Peter Parker", 21);
    Student b = new Student("Walter White", 55);
    Student c = a;
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
  }

  static class Student{
    private String name;
    private int age;

    public Student(String name, int age){
      this.name = name;
      this.age = age;
    }
    public String getName() {
      return name;
    }
    public int getAge() {
      return age;
    }
  }
}