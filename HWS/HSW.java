/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewar.pkg2;

/**
 *
 * @author Noahs
 */
public class HSW {
    public String high(String s) {
        String []str = s.split(" ");
        int []countWord = new int[str.length];
        int j = 0;
        for(int i = 0 ;i <str.length;i++){
            countWord[j++] = wordPoint(str[i]);
        }
        int max = countWord[0];
        int index = 0;
        for(int i =0 ; i <countWord.length;i++){
            if(countWord[i] > max){
                max = countWord[i];
                index = i;
            }
            if(countWord[i] == max){
                continue;
            }
        }
        return str[index];
  }
    public int wordPoint(String s){
        int count = 0;
        for(int i = 0 ;i <s.length();i++){
            if(s.charAt(i) == 'a'){
                count+=1;
            }
            if(s.charAt(i) == 'b'){
                count+=2;
            }
            if(s.charAt(i) == 'c'){
                count+=3;
            }
            if(s.charAt(i) == 'd'){
                count+=4;
            }
            if(s.charAt(i) == 'e'){
                count+=5;
            }
            if(s.charAt(i) == 'f'){
                count+=6;
            }
            if(s.charAt(i) == 'g'){
                count+=7;
            }
            if(s.charAt(i) == 'h'){
                count+=8;
            }
            if(s.charAt(i) == 'i'){
                count+=9;
            }
            if(s.charAt(i) == 'j'){
                count+=10;
            }
            if(s.charAt(i) == 'k'){
                count+=11;
            }
            if(s.charAt(i) == 'l'){
                count+=12;
            }
            if(s.charAt(i) == 'm'){
                count+=13;
            }
            if(s.charAt(i) == 'n'){
                count+=14;
            }
            if(s.charAt(i) == 'o'){
                count+=15;
            }
            if(s.charAt(i) == 'p'){
                count+=16;
            }
            if(s.charAt(i) == 'q'){
                count+=17;
            }
            if(s.charAt(i) == 'r'){
                count+=18;
            }
            if(s.charAt(i) == 's'){
                count+=19;
            }
            if(s.charAt(i) == 't'){
                count+=20;
            }
            if(s.charAt(i) == 'u'){
                count+=21;
            }
            if(s.charAt(i) == 'v'){
                count+=22;
            }
            if(s.charAt(i) == 'w'){
                count+=23;
            }
            if(s.charAt(i) == 'x'){
                count+=24;
            }
            if(s.charAt(i) == 'y'){
                count+=25;
            }
            if(s.charAt(i) == 'z'){
                count+=26;
            }
        }
        return count;
    }
}
