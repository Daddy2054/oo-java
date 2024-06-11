package labChallenge;

//add class definitions below this line
    class Person{
        private String name;
        private int age;

        private String occupation;

        public Person(String name, int age, String occupation){
            this.name = name;
            this.age = age;
            this.occupation = occupation;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getOccupation(){
            return occupation;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setOccupation(String occupation){
            this.occupation = occupation;
        }
    }

  
//add class definitions above this line

public class EncapsulationLabChallenge {
    public static void main(String[] args) {
      
      //add code below this line
  Person person = new Person("Citra Curie",16,"student");
  System.out.println(person.getName());
  person.setName("Rowan Faraday");
  System.out.println(person.getAge());
  person.setAge(18);
  System.out.println(person.getOccupation());
  person.setOccupation("plumber");
      
  
      //add code above this line
    }
  }