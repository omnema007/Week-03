package inputstreamreader.convertbytestreamtocharacterstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ByteToCharacterStream {
    public static void byteToCharacterStream() {
        String filPath = "file1";

        try {
            FileInputStream fs = new FileInputStream(filPath);
            InputStreamReader isr = new InputStreamReader(fs, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;

            while ((line = br.readLine()) != null) {
                char[] ch = line.toCharArray();
                for (char c : ch) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
