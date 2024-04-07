package exercice.com.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> votes = new LinkedHashMap<>();
            for(String line : bf.lines().toList()) {
                String[] items = line.split(",");


                if(votes.containsKey(items[0])) {
                    int newVote = votes.get(items[0]) + Integer.parseInt(items[1]);
                    votes.put(items[0], newVote);
                } else{
                    votes.put(items[0], Integer.parseInt(items[1]));
                }
            }

            for(String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
