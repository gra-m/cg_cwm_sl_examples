package cg.abstractclasses._1417_currencies;

//region OriginalCode
/*
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " has a stash of " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //write your code here
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}*
*  */

// endregion


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " has a stash of " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> allMoney;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //write your code here
            this.allMoney.add(new Rouble(100.00));
            this.allMoney.add(new Euro(101.00));
            this.allMoney.add(new Euro(102.00));
        }


        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
