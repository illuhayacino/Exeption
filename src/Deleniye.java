import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Deleniye {

    public static int getAreaValue(int x, int y){
        if(y == 0) throw new ArithmeticException("value of 'y' is y="+y);
        return x/y;
    }

    public static void main(String[] args) {

        int result = 0;

        try {
            result = getAreaValue(12, 0);

        }
        finally {
            System.out.println("result:" + result);
        }



    }

}
