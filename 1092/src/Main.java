import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);

        while (scanner01.hasNext()) {
            int linenumeber = scanner01.nextInt();
            int count = 0,result = 0;
            int number01[] = new int[linenumeber];
            if(linenumeber == 0){
                break;
            }
            while (count<linenumeber) {
                number01[count]= scanner01.nextInt();
                result+=number01[count];
                count++;
            }
           System.out.println(result);
        }

    }
}
