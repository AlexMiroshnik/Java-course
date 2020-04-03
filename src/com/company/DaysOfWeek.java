package com.company;

public enum DaysOfWeek {
    Monday("Понеділок","Monday", "Понедельник"),
    Tuesday("Вівторок","Tuesday", "Вторник"),
    Wednesday("Середа","Wednesday", "Среда"),
    Thursday("Четвер","Thursday", "Четверг"),
    Friday("П'ятниця","Friday", "Пятница"),
    Saturday("Неділя","Saturday", "Воскресенье"),
    Sunday("Субота","Sunday", "Суббота");
    String ukr, eng, rus;
    DaysOfWeek(String ukr, String eng, String rus) {
        this.ukr = ukr;
        this.eng = eng;
        this.rus = rus;
    }

    public String get(){
        return ukr+" "+eng+" "+rus;
    }
}

