package codewar.DecimaltoRoman;

public class Conversion {
    public String solution(int n) {
        int[] i = new int[4];
        i = digitSplit(n);
        String s = digitConvert(i);
        return s;
    }
    public int[] digitSplit(int n){
        int digit = 0;
        int tens = 0;
        int hund = 0;
        int thous = 0;
        if(n>0){
            if(n >= 1000){
                thous = n/1000;
                n=n%1000;
                hund = n/100;
                n=n%100;
                tens = n/10;
                digit=n%10;
            }
            else if(n >= 100 && n<1000){
                hund = n/100;
                n=n%100;
                tens = n/10;
                digit=n%10;
            }
            else if(n >= 10 && n<100){
                tens = n/10;
                digit=n%10;
            }
            else{
                digit = n;
            }
        }
        return new int[]{thous,hund,tens,digit};
    }
    public String digitConvert(int[] n){
        String sum = "";
        //Thousands
        for(int i = 0; i <n[0];i++){
            sum+="M";
        }
        //Hundred
        int n1 = n[1];
        for(int i = 0; i <n[1];i++){
            if(n1 == 4){
                sum+="CD";
                break;
            }
            if(n1 > 5 && n1<9){
                sum+="D";
                n1=-1;
                i+=5;
            }if(n1 == 5){
                sum+="D";
                break;
            }
            if(n1 == 9){
                sum+="CM";
                n1=-1;
                break;
            }
            
            sum+="C";
        }
        //Tens
        int n2 = n[2];
        for(int i = 0; i <n[2];i++){
            if(n2 == 4){
                sum+="XL";
                break;
            }
            if(n2 > 5 && n2 < 9){
                sum+="L";
                n2=-1;
                i+=5;
            }if(n2 == 5){
                sum+="L";
                break;
            }
            if(n2 == 9){
                sum+="XC";
                n2=-1;
                break;
            }
            sum+="X";
        }
        //Digit
        int n3 = n[3];
        for(int i = 0; i <n[3];i++){
            if(n3 == 4){
                sum+="IV";
                break;
            }
            if(n3 > 5 && n3 < 9){
                sum+="V";
                n3=-1;
                i+=5;
            }if(n3 == 5){
                sum+="V";
                break;
            }
            if(n3 == 9){
                sum+="IX";
                n3=-1;
                break;
            }
            
            sum+="I";
        }
        
        return sum;
    }
}


