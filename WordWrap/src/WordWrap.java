import java.util.Scanner;

public class WordWrap {
    public static void main(String []args) {
        Scanner scnrforinput=new Scanner(System.in);
        int maxchar = Integer.parseInt(scnrforinput.nextLine());
        String paragraph = "";
        String line = ""; 
        
        // Taking in user input
        while (!line. equals("Stop.") ) { // This will scan until "Stop."

	        line = scnrforinput.nextLine(); // Scanning each line from user input
	        

	        if(!line.equals("Stop.")){
	        	paragraph += line + "\n"; // Create new line after 
	        	
	        }

        }
        
        Scanner scnrforparagraph = new Scanner(paragraph); // Takes rough user input, and scans it
        
    	String newparagraph = ""; // Resets new paragraph String
    	String newline = ""; // Resets new new line String
    	String x; // Declares variable
    	
    	
    	// Scanner for rough paragraph and revises it
        while (scnrforparagraph.hasNext()) { // .hasNext return boolean, checks if it next
         	x = scnrforparagraph.next(); // Places scnrforparagraph.next() into variable


         	if (newline.length() + x.length()  >= maxchar) { // Takes length per line of rough while also accounts for the adjustments, the revised new line length
            
                							//  Basically checks if the new word fits on the new line, and if it doesnt, then proceeds the following
       		 newparagraph += newline + "\n";
       		 newline = "";

        	}
        	
        	newline += x + " ";

        }
        						 // You're always printing the line when it's full so if the last line is not full by the time your hit stop it won't be printed
        newparagraph += newline; // This add the very last line after the loop, and line 16 skips generating the final "Stop."
        
        System.out.println(newparagraph); // Prints final paragraph

        
    }
    
}