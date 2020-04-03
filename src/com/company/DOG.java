package com.company;

import java.util.Objects;

public class DOG {
        private String name;
        private int age;
        private BREED breed;

        public DOG() {
        }

        public DOG(String name, int age, BREED breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public BREED getBreed() {
            return breed;
        }

        public void setBreed(BREED breed) {
            this.breed = breed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DOG dog = (DOG) o;
            return Objects.equals(name, dog.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

