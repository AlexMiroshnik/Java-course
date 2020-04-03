package com.company;

import com.company.Week;

import java.util.Random;

public class Days {
        public static void main(String[] args) {
            com.company.Week main = new com.company.Week();
            Random random = new Random();
            int dayNumber = random.nextInt(7) + 1;
            System.out.println(dayNumber);
            main.choseDay(dayNumber);
        }
        public void choseDay(int num) {
            switch (num) {
                case 1:
                    System.out.println(DaysOfWeek.Monday.get());
                    break;
                case 2:
                    System.out.println(DaysOfWeek.Tuesday.get());
                    break;
                case 3:
                    System.out.println(DaysOfWeek.Wednesday.get());
                    break;
                case 4:
                    System.out.println(DaysOfWeek.Thursday.get());
                    break;
                case 5:
                    System.out.println(DaysOfWeek.Friday.get());
                    break;
                case 6:
                    System.out.println(DaysOfWeek.Saturday.get());
                    break;
                case 7:
                    System.out.println(DaysOfWeek.Sunday.get());
                    break;

                default: System.out.println("Wrong number");
                    break;
            }
        }
    }

