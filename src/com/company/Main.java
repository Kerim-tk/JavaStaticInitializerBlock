import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int B,H;
        boolean flag = true;
        {
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            if(B<=0 || H<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag = false;
            }
            if(flag){
                int area=B*H;
                System.out.print(area);
            }
        }


    }

}

