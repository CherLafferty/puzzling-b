// You will need to import the Random library from java.util
import java.util.Random;
import java.util.ArrayList;

class PuzzleJava {

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public ArrayList<Integer> getTenRolls(){

        // instantiat new ArrayList for random numbers
        ArrayList<Integer> tenNums = new ArrayList<Integer>();
         // instantiate new instance of Random from Random library
        Random random = new Random();
        for(int i = 1; i <= 10; i++) {
            tenNums.add(random.nextInt(20) + 1);
        }
        return tenNums;
    }


    public String getRandomLetter(){
         // instantiate new instance of Random from Random library
        Random random = new Random();
        String [] alphabet = new String[26];
        String alphabetLetters = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++){
            // use charAt method to get value from string thanks to video demo
            alphabet[i] = String.valueOf(alphabetLetters.charAt(i));
        }
        return alphabet[random.nextInt(26)];
    }

    // Write a method that uses the previous method to create a random string of eight characters, and return that string.
    public String generatePassowrd() {
        // create string placeholder variable
        String password = "";
        // for a password length of 8 get randomletters from above method
        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    // Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> newPassword = new ArrayList<String>();

        for(int i = 0; i < length; i++){
            newPassword.add(generatePassowrd());
        }
        return newPassword;
    }


      // To use methods from the Random library you will need to create an instance of Random
        // Random randMachine = new Random();
    // From there you can use any of the methods listed in the documentation. For example:
        //  randMachine.setSeed(35679); // <--- you won't need to use this method.



}