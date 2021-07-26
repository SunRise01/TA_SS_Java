package HW_TA_JAVA_2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Menu {
    //possible options in menu
    public enum menuOptions{
        add,
        remove,
        show,
        sort,
        stop
    }

    public List<String> carList = new ArrayList();
    menuOptions[] options = menuOptions.values();
    menuOptions activeChoice=menuOptions.add;
    Scanner sc = new Scanner(System.in);

    public void startMenu() {
        while (!activeChoice.equals(menuOptions.stop)) {
            try {
                System.out.println();
                System.out.println("Possible options:");
                Arrays.stream(options).forEach(System.out::println);
                System.out.println("Enter the option");
                activeChoice=menuOptions.valueOf(sc.nextLine());
                switch (activeChoice) {
                    case add -> add();
                    case show -> show();
                    case sort -> sort();
                    case remove -> remove();
                    case stop -> activeChoice = menuOptions.stop;
                }
            }catch (IllegalArgumentException e){
                System.out.println("Wrong option");
            }
        }
    }
    //adding car to list
    public void add(){
        System.out.println("Enter the name of car");
        carList.add(sc.nextLine());
    }

    //removing car from list
    public void remove(){
        System.out.println("Enter the index of car");
        carList.remove(Integer.parseInt(sc.nextLine()));
    }

    //showing all cars
    public void show(){
        carList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    //sorting list
    public void sort(){
        carList.sort(String::compareTo);
        System.out.println("Sorting is done!");
    }

}
