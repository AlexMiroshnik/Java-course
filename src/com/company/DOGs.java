package com.company;


public class DOGs {

        public static void main(String[] args) {
            DOG dog1 = new DOG ("Eby", 8, BREED.LABRADOR);
            DOG dog2 = new DOG ("Diesel", 5, BREED.BULLDOG );
            DOG dog3 = new DOG ("DEN", 14, BREED.SPANIEL );

            if(dog1.equals(dog2) | dog1.equals(dog3) | dog2.equals(dog3)) {
                System.out.println("Two dogs with the same name");
            }
            else {
                System.out.println("No dogs with the same name");
            }

            DOG olderDog = null;

            if(dog1.getAge()>dog2.getAge() & dog1.getAge()>dog3.getAge()){
                olderDog = dog1;
            }
            else if (dog2.getAge()>dog1.getAge() & dog2.getAge()>dog3.getAge()){
                olderDog =dog2;
            }
            else if (dog3.getAge()>dog1.getAge() & dog3.getAge()>dog2.getAge()){
                olderDog = dog3;
            }

            if (olderDog != null){
                System.out.println("Oldest dog" +olderDog.getName()+" "+olderDog.getBreed());
            }
            else {
                System.out.println("All dogs has the same age");
            }

        }
    }
