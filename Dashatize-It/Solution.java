
package dashatizeit;

 public class Solution {

    public String dashatize(int num) {
        int numm=num;
        if(num == Integer.MIN_VALUE){
            num--;
        }
        num = Math.abs(num);
        if(num == 0){
            return "0";
        }
        int len = (int) (Math.log10(num) + 1);
        int lenn = len;
        String buffer = "";
        String str = "";
        int n = 0;
        int last_n = 0;
        for (int i = 0; i < len; i++) {
           
            n = (int) (num / Math.pow(10, lenn - 1));
            buffer = String.valueOf(n);
            if(len == 1){
                str += buffer;
                break;
            }
           
            if (n % 2 > 0 && str.length() == 0) {
                str += buffer + "-";
                buffer = "";
            } else if (last_n % 2 == 0&&n % 2 > 0 && i < len - 1) {
                str += "-" + buffer + "-";
                buffer = "";
            } else if (last_n % 2 > 0 && n % 2 > 0 && i < len - 1) {
                str += buffer+"-";
                      buffer="";
            } else if (last_n % 2 == 0 && n % 2 > 0 && i == len - 1) {
                str += "-" + buffer;
                buffer = "";
            }
            else if (last_n % 2 > 0 && n % 2 > 0 && i == len - 1) {
                str += buffer;
                buffer = "";
            }
            str += buffer;
            num %= Math.pow(10, lenn - 1);
            lenn--;
            last_n = n;
        }
        if(numm == Integer.MIN_VALUE){
            str = str.substring(0,str.length()-2);
            str += "8";
        }
        return str;
    }

}
