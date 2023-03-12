import java.io.IOException;
import java.util.Scanner;

class Solution{
    public static void main(String[] args) throws IOException {
        int n = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        float x1, x2, y1, y2,y,x;
        char op;
        for (int i = 0; i < n; i++) {
            x1 = in.nextFloat();
            in.next().charAt(0);
            y1 = in.nextFloat();
            op = in.next().charAt(0);
            x2 = in.nextFloat();
            in.next().charAt(0);
            y2 = in.nextFloat();

            if(op == '+'){
                x = x1*y2 + x2*y1;
                y = y1*y2;
            }else if(op == '-'){
                x = x1*y2 - x2*y1;
                y = y1*y2;
            }else if(op == '*'){
                x = x1*x2;
                y = y1*y2;
            }else{
                x = x1*y2;
                y = y1*x2;
            }

            System.out.print((int)x + "/" + (int)y+" = ");
            int mdc = (int) (Math.abs(x)>=Math.abs(y)?Math.abs(y):Math.abs(x));
            while(mdc >= 1){
                if(x%mdc == 0 && y%mdc == 0){
                    x = x/mdc;
                    y = y/mdc;
                }
                mdc--;
            }
            System.out.println((int)x + "/" + (int)y);
        }
    }
}