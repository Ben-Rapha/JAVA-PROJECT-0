//@ Author Kingsley Otto
// lab session number 42702 TuTh 11:10 - 12:00 pm



//package project0;

import javax.swing.JOptionPane;

public class Project0 {
    
    public static void main(String[] args) {
        String inputWord;
        int E, e;
        while (true) {
        // This line asks the user for input by popping out a single window with 
        //text input
            inputWord = JOptionPane.showInputDialog(null,"Plese enter a "
                    + "sentence: Enter \"STOP\" to exit");
            
            //This exit the program if the user types "STOP"
            if (inputWord.equalsIgnoreCase("STOP") ){
                System.exit(0);
            }
            
            // couting the number of times E & e occurs in a string
             E = inputWord.length() - inputWord.replaceAll("E","").length();
             e = inputWord.length() - inputWord.replaceAll("e","").length();
          
            //echoing the result to the user 
            JOptionPane.showMessageDialog(null," Number of lowercase e's : " + e +
                    "\n" + " Number of upperrcase e's : " + E );
    }
    
         
        
    }
}
