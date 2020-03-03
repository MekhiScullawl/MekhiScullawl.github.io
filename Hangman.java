package annette.godtland.mywindow;
import com.godtsoft.diyjava.DIYWindow;

import java.util.Scanner;
import java.util.Random;

class Hangman extends DIYWindow {
  public String randomWord() {
  Random random = new Random();
    String[] word = new String[] { "BANANA", "CHICKEN", "FRIED", "PINEAPPLE"};
    int spot = random.nextInt(5);
    return word[spot];
  }
  public void picture(int wrong) {
    int f = 0;
    int x = 0;
    System.out.println("    -------");
    System.out.println("    ||    |");
    //f += 1;
    
    if (wrong == 0) {
      while (x < 4) {
        System.out.println("    ||");
        x += 1;
      } 
    }
    if (wrong == 1) {
      System.out.println("    ||    O");
      while (x < 3) {
        System.out.println("    ||");
        x += 1;
        }  
    }
    if (wrong == 2) {
      System.out.println("    ||    O");
      System.out.println("    ||    |");
      while (x < 2) {
        System.out.println("    ||");
        x += 1;
        } 
    }      
    if (wrong == 3) {
      System.out.println("    ||    O");
      System.out.println("    ||   /|");

      while (x < 2) {
        System.out.println("    ||");
        x += 1;
        } 
    }  
    if (wrong == 4) {
      System.out.println("    ||    O");
      System.out.println("    ||   /|\\");

      while (x < 2) {
        System.out.println("    ||");
        x += 1;
        } 
    }  
    if (wrong == 5) {
      System.out.println("    ||    O");
      System.out.println("    ||   /|\\");
      System.out.println("    ||   /");
      while (x < 1) {
        System.out.println("    ||");
        x += 1;
        } 
    }  
    if (wrong == 6) {
      System.out.println("    ||    O");
      System.out.println("    ||   /|\\");
      System.out.println("    ||   / \\");
    }  
    System.out.println("    ||    ");
    System.out.println("----------");
  }
  public String input() {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose a letter");
    String inputVar = input.nextLine();
    return inputVar;
  }
    
    
 
  public Hangman() {
    Scanner inputLine = new Scanner(System.in);
    String randomWord = randomWord();
    int wrong = 0;
    boolean over = false;
    String b = "-";
    String a = "-";
    String n = "-";
    String c = "-";
    String h = "-";
    String i = "-";
    String k = "-";
    String e = "-";
    String f = "-";
    String r = "-";
    String d = "-";
    String p = "-";
    String l = "-";
    
    String wordWhole = "";
    String playAgain = "";
    while (over == false) {
      String input = input();
      input = input.toUpperCase();
      
      if (randomWord.contains(input)) {
         
      }	
      else {
      	wrong += 1;
      }
      
      picture(wrong);
      if (randomWord == "BANANA"){
    	   if (input.equals("B")) {
            b = "b";
         }
         else if (input.equals("B")) {
            a = "a";
         }
         else if (input.equals("N")) {
            n = "n";
         }
         wordWhole = b+a+n+a+n+a;
         System.out.println(wordWhole);
      }
      else if (randomWord == "CHICKEN"){
    	   if (input.equals("C")) {
            c = "c";
         }
         else if (input.equals("H")) {
            h = "h";
         }
         else if (input.equals("I")) {
            i = "i";
         }
         else if (input.equals("C")) {
            c = "c";
         }
         else if (input.equals("K")) {
            k = "k";
         }
         else if (input.equals("E")) {
            e = "e";
         }
         else if (input.equals("N")) {
            n = "n";
         }
         wordWhole = c+h+i+c+k+e+n;
         System.out.println(wordWhole);
      }
      
      else if (randomWord == "FRIED"){
    	   if (input.equals("F")) {
            f = "f";
         }
         else if (input.equals("R")) {
            r = "r";
         }
         else if (input.equals("I")) {
            i = "i";
         }
         else if (input.equals("E")) {
            e = "e";
         }
         else if (input.equals("D")) {
            d = "d";
         }
         wordWhole = f+r+i+e+d;
         System.out.println(wordWhole);
      }
      
      else if (randomWord == "PINEAPPLE"){
    	   if (input.equals("P")) {
            p = "p";
         }
         else if (input.equals("I")) {
            i = "i";
         }
         else if (input.equals("N")) {
            n = "n";
         }
         else if (input.equals("E")) {
            e = "e";
         }
         else if (input.equals("A")) {
            a = "a";
         }
         else if (input.equals("P")) {
            e = "p";
         }
         else if (input.equals("L")) {
            l = "l";
         }
         wordWhole = p+i+n+e+a+p+p+l+e;
         System.out.println(wordWhole);
      }
      if (wordWhole.equals("banana") || wordWhole.equals("chicken") || wordWhole.equals("fried") || wordWhole.equals("pineapple")) {
         over = true;
         System.out.println("You won, great job!");
      }   
      else if (wrong == 6){
         over = true;
         System.out.println("You lost, great try!");
      }
    } 
    
    PlayAgain();
  }
  public void PlayAgain() {
    Scanner inputLine = new Scanner(System.in);
    System.out.println("Do you want to play again?");
    String playAgain = inputLine.nextLine();
    playAgain = playAgain.toUpperCase();
    switch (playAgain){
    case "YES":
      new Hangman();
      break;
    
    case "NO":
      break;
    
    default:
      PlayAgain();
      break;
    }
  }
  public static void main(String[] args) {
    new Hangman();

  }
}

