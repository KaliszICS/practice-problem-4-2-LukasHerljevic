/**
 * @param Dog javadoc -d ./destinationFolder  ./src/main/java/Example.java
 */
public class Dog {
   
    private String name;
    private String breed;
    private int weight;

    //con
    public Dog(String name, String breed, int weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    //get
    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public int getWeight(){
        return weight;
    }

    //set
    public void setName(String name){
        this.name = name;
    } 

    public void setBreed(String breed){
        this.breed = breed;
    } 

    public void setWeight(int weight){
        this.weight = weight;
    } 

}
     