package HW_TA_JAVA_2;

import java.util.Scanner;

public class Mercedes extends Car{
    Scanner sc = new Scanner(System.in);

    public Mercedes(){
        setBrand("Mercedes");
    }

    public void setMercedesModel(){
        System.out.println("Please, set your Mercedes model");
        setModel(sc.nextLine());
    }
}
