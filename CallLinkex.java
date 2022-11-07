package src;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CallLinkex {
    Run r=new Run();

    ArrayList<Linkey> execute(){
        System.out.println("Linkex starting ....");
        try {
            r.runProcess("pwd");
            System.out.println("**********");
         //  System.out.println("**********");
           r.runProcess("../Canard/src mvn package");
            r.runProcess("java -jar  ../linkex/target/LinkkeyDiscovery-1.0-SNAPSHOT-jar-with-dependencies.jar");
            System.out.println("**********");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Linkey> lks=new ArrayList<>();
        return lks;
    }
    ArrayList<Linkey> execute(Correspondance c){
        try {
            r.runProcess("pwd");
            System.out.println("**********");
            r.runProcess("java -jar  target/LinkkeyDiscovery-1.0-SNAPSHOT-jar-with-dependencies.jar");
            System.out.println("**********");
            //   runProcess("java -cp src com/journaldev/files/Test Hi Pankaj");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String c1 = c.getC1().toString();
        String c2 = c.getC2().toString();

        try {
            r.runProcess(c1.concat(c2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ArrayList<Linkey> lks=new ArrayList<>();
        return lks;
    }
}
