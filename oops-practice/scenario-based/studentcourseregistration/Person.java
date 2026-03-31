package studentcourseregistration;

//Base class representing a person 

class Person{
protected String name;
protected int age;


//Constructor
public Person(String name , int age){
    this.name = name;
    this.age = age;

}

//Getter methods 
public String getName(){
    return name;

}
public int getAge(){
    return age;
}

}