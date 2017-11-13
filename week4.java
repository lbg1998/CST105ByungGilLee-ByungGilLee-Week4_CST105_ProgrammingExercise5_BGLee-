import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class week4 {
	public static void main(String[] args) {  
		String entireText = "";
		char[][] textArray;
		try {  
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\brian lee\\Desktop\\week\\week4.txt"));
			
			String readLine = "";
	
			while((readLine = br.readLine()) != null){  // begin while
				entireText += readLine;
                                
                                System.out.println(entireText);
			}      
			br.close();
		    } 
                catch (IOException e) {
			e.printStackTrace();
		} 
		textArray = LoadArray(entireText);
		
		arrayOutput(textArray);
	      
     } 
	public static char[][] LoadArray(String entireText){
		char[][] textArray = new char[20][45];
		int count = 0;
		
		for (int i = 0; i < 20; i++){ 
			for (int j = 0; j < 45; j++){ 
				if (count < entireText.length()){ 
					textArray[i][j] = entireText.charAt(count);
                                        System.out.println(textArray[i][j]);
					count++;
				} 
                                else {
					textArray[i][j] = '@';
				}
			} 
		}
		return textArray;
	}  
	private static void arrayOutput(char[][] textArray) { 
		StringBuilder outputText = new StringBuilder();
		
		for (int i = 0; i < 45; i++){
			for (int j = 0; j < 20; j++){
   			   outputText.append(textArray[j][i]);  
			}
		} 
		System.out.println(outputText);  
	}           
} 