package com.company.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    private static final String lowerCaseCharacters = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCaseCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final Random random = new Random();

    ///Numeric Functions
    public int getNumber(){
        return random.nextInt();
    }

    public List<Integer> getNumbers(int count) throws IllegalArgumentException{

        if(count <= 0){
            throw new IllegalArgumentException("Count must be greater than zero");
        }

        List<Integer> numbers = new ArrayList<>(count);

        for(int i = 0; i < count; i++){
            numbers.add(random.nextInt());
        }

        return numbers;
    }
    ///Numeric Functions

    ///Character Functions

    public char getLowerCaseChar(){
        return getChar(lowerCaseCharacters);
    }

    public char getUpperCaseChar(){
        return getChar(upperCaseCharacters);
    }

    private char getChar(String characterSource){
        return characterSource.charAt(random.nextInt(characterSource.length()));
    }

    ///Character Functions
}
