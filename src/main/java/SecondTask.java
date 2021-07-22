import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    public void findTheBiggestOddAndEven(){
        int n=0;
        //reading the start and end of interval from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("enter the size of Fibonacci set");
            n = Integer.parseInt(reader.readLine());
        }catch (IOException e){
            System.err.println("Error: "+e);
        }catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }

        //creating the Fibonacci set
        List<Long> fList = new ArrayList<>();
        fList.add(0L);
        fList.add(1L);
        for (int i = 2; i < n; i++) {
            fList.add(fList.get(i-1)+fList.get(i-2));
        }

//        //sout of set
//        for (int i = 0; i != fList.size(); i++) {
//            System.out.print(fList.get(i)+" ");
//        }
//        System.out.println();

        //finding the biggest odd and even numbers
        long biggestOdd=0, biggestEven=0;
        for (int i = fList.size()-1; i >=0 ; i--) {
            if ((biggestEven==0) && (fList.get(i) % 2 == 0)) biggestEven=fList.get(i);
            if ((biggestOdd==0) && (fList.get(i) % 2 != 0)) biggestOdd=fList.get(i);
            if (biggestEven != 0 && biggestOdd !=0) break;
        }
        System.out.println("Biggest odd number is "+biggestOdd);
        System.out.println("Biggest even number is "+biggestEven);

        //finding the precentage
        int countEvens=0;
        double precentageOfEvens;
        for (int i = 0; i != fList.size() ; i++) {
            if (fList.get(i) % 2 == 0)countEvens++;
        }
        System.out.println("Precentage of even numbers is "+ countEvens*100/fList.size()+"%");
        System.out.println("Precentage of odd numbers is "+ (100-(countEvens*100/fList.size()))+"%");
    }
}
