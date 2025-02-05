package inputstreamreader.readuserinputandwritetofile;

import java.io.*;

public class ReadUserInput {
    public static void readUserInput() {
        String filePath = "file2";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter text to save the file or type exit to stop: ");
            String userInput;
            while(!(userInput = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(userInput);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("User input saved to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
