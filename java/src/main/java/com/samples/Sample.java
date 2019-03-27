package com.samples;

import java.util.ArrayList;

public class Sample {

    public static void main (String ... args){
        ArrayList<Person> persons = new ArrayList<Person>(){{
            add(new Person("Bert", 32));
            add(new Person("Blaise", 3));
            add(new Person("Caden", 1));
        }};

        Person found = null;
        for(Person p2 : persons){
            if(p2.getName().equals("Bert")){
                found = p2;
            }
        }
        if(found != null ){
           System.out.println("Found " + found.getName()) ;
        }


        Person bert = persons.stream()
                .filter( person -> person.getName().equals("Bert"))
                .findAny()
                .orElse(null);
        System.out.println(bert.getName());
        System.out.println(bert.toString());


    }
}
