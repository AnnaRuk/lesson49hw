package models;


import java.util.Objects;
import java.util.Random;

public class User implements Comparable<User>{

    private String name;
    private double height;

    Random random = new Random();



    public User (){
        //this.height = random.nextDouble(1.20,2.20);
        this.height  = (Double.parseDouble(String.format("%.2f", random.nextDouble(1.20,2.20)))) ;
        this.name = "UserName"+random.nextInt(0,10000);
    }

    public User(String name, double height){
        this.height  = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Double.compare(user.height, height) == 0 && Objects.equals(name, user.name) && Objects.equals(random, user.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, random);
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public int compareTo(User o) {
        if(this.height==o.height) return 0;
        if (this.height>o.height)return 1;
        return -1;
    }
}
