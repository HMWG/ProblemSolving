import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append("         ,r'\"7").append("\n")
                .append("r`-_   ,'  ,/").append("\n")
                .append(" \\. \". L_r'").append("\n")
                .append("   `~\\/").append("\n")
                .append("      |").append("\n")
                .append("      |").append("\n");
        System.out.println(sb);
    }
}
