

import javax.swing.JOptionPane;

public class t {
public static void main(String[] args) {
String hi =	JOptionPane.showInputDialog("what is your name");
	if (hi .equals("khia")){
		speak("listen up you nimkimpoop you are in need of a bag of knowlage you dingis ");
	}
	else if (hi .equals("noelani")){
		speak("it dosen't matter what your name is");
	}
	else if(hi .equals("diego")){
		speak("if your plan is what you have now you need to go back to the drawing borad because your plan abloulutly sucks!");
	}
	else if(hi .equals("jerry")){
		speak("you haven't done anything bad so hi");
	}
}

	
	
	
	
	
	
	
	
	
	static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
}
}







































































































