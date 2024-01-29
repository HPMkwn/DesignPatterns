package DesignPatternExercise.Exercise5Builder;

import java.util.List;

public class Dog {

    static class DogBuilder{
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public DogBuilder() {
            this.name = null;
            this.type = null;
            this.age = null;
            this.toys = null;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public DogBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public DogBuilder setToys(List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build(){
            return new Dog(this.name,this.type, this.age, this.toys);
        }
    }

    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog(String name, String type, Integer age, List<String> toys) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.toys = toys;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getToys() {
        return toys;
    }

    public static DogBuilder getBuilder(){
        return new DogBuilder();
    }
}
