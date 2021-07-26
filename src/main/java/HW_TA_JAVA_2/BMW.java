package HW_TA_JAVA_2;

import java.util.Scanner;

public class BMW extends Car{
    Scanner sc = new Scanner(System.in);

    public BMW(){
        setBrand("BMW");
    }

    public void setBmwModel(){
        System.out.println("Please, set your BMW model");
        setModel(sc.nextLine());
    }
}
