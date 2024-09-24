package numbers;
public class power {
    public static void main(String [] args){
        int base=5,power=2,result=1;

        while(power>0){
            result=result*base;
            power--;
        }
        System.out.println(result);
    }
}
