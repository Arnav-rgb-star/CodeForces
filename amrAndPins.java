
import java.io.*;
import java.util.*;
public class amrAndPins {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double r = Double.parseDouble(st.nextToken());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double x1 = Double.parseDouble(st.nextToken());
        double y1 = Double.parseDouble(st.nextToken());

        double dist = (x1-x)*(x1-x) + (y1-y)*(y1-y);
        double d = Math.sqrt(dist);

        int ans = (int)dsMath.ceil(d/(2*r));
        System.out.println(ans);
    }
}
