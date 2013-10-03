package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author zikesjan
 */
public class Solution {

    private static int number;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            readFromStdInFast();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(number));
        sb.reverse();
        
        System.out.println(Integer.parseInt(sb.toString(), 2));                
    }
    
    
    
    /*
     * just reading of the data from the system
     */
    static void readFromStdInFast() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        number = Integer.parseInt(st.nextToken());
        
    }
}
