package week3java;

public class Person {

    public String firstName;
    public String lastName;
    public int age;



    public String getFirstName(){
        return firstName;
    }
    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        }
      return false;
    }
    public String getFullName(){
      if(firstName.isEmpty() && lastName.isEmpty()){
          return "";
      } else if(firstName.isEmpty()){
          return lastName;
      } else if(lastName.isEmpty()){
          return firstName;
      }
        return this.firstName + " "+ lastName;
    }
}
