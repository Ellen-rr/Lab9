class Person {
  private String name;
  private int age;
  private String color;

  Person(String aName, int aAge, String aColor) {
    this.name = aName;
    this.age = aAge;
    this.color = aColor;

  }
  String getName(){
    return this.name;
  }

  int getAge(){
    return this.age;
  }

  String getColor(){
    return this.color;
  }
}