

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

    // 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		
	
    // 2. ask the user for a sentence
	
    // 3. call the speak method below and send it the sentence
	//for (int i = 0; i < 21. ; i++) {
		//String hi =	JOptionPane.showInputDialog("type in a sentence");
		
	speak("da da da dum dada da dada dum dum dum dum dada dum dada");
	//}
    // 4. repeat steps 2 and 3 a lot of times
	}
/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014



