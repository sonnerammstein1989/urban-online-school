import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class lessFile {
    public static void lesson(String[] args) {

        FileWriter io;   Scanner keyb;
        String inputStr, inputBuff = "";

        try {
            io = new FileWriter(new File("D:/test.txt"));
            keyb = new Scanner(System.in);
            System.out.println("Input smth from keyboard");
            do {
                inputStr = keyb.nextLine();
                if ( inputStr.length()==1 && inputStr.charAt(0) == '0' )
                    break;
                else inputBuff = inputBuff.concat(inputStr+"\n");

            } while ( true );
            if( inputBuff.length()!=0 ){
                io.append(inputBuff).close();
                System.out.println("file created");
            } else { System.out.println("no input string");}
        } catch (Exception e) {
            System.out.println( "err situ : " + e.getMessage() );
        }
    }
}
