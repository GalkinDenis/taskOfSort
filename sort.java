package com.example.contest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class yandex {
    public static void main(String[] args) {

        Map<Integer, String> arStr2 = new HashMap<>();
        String intStr = "";
        char ch;
        String str;

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){

            for(;;){
                str = bf.readLine();
                if(!str.equals("null")){
                    for(int z = 0; z < str.length(); z++) {
                        ch = str.charAt(z);
                        if(Character.isDigit(ch)) {
                            intStr = intStr.concat(String.valueOf(ch));
                        }
                    }
                    str = str.replaceAll("\\d", "");
                    arStr2.put(Integer.parseInt(intStr)-1, str);
                    intStr = "";
                }else{
                    break;
                }
            }

            for(int i = 0; i < arStr2.size(); i++) {
                System.out.println(arStr2.get(i));
            }
            }catch(IOException e){
            e.printStackTrace();
        }
    }
}
