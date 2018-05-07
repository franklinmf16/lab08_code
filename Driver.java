package lab08_code;

import java.util.*;
import java.io.*;



public class Driver {
    public static void main(String[] args){
        new Driver().run();
    }

    public void run(){
        int a = 0;
        while(a == 0) {
            Manager manager = new Manager();
            Scanner input = new Scanner(System.in);
            System.out.println("please enter the method");
            int requireMethod = input.nextInt();

            if (requireMethod == 1) {
                System.out.println("input is by hand");
                manager.setRollingStrategy(new Byhand());
                Method method = new Method();
                System.out.println("please rolling by entering number");
                int rollingNumber = input.nextInt();
                method.setByHand(rollingNumber);
                manager.operation(method);

            } else if (requireMethod == 2) {
                //by File
                System.out.println("input is by File");
                manager.setRollingStrategy(new ByFile());
                Method method = new Method();

                FileReader inStream = null;
                try {
                    inStream = new FileReader("/Users/bok/Desktop/UniMelb/30006-Software Modelling and Design/lab08/src/lab08_code/file.txt");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }



                method.setFile(inStream);
                manager.operation(method);



            } else if (requireMethod == -1){
                System.out.println("Wrong Input, please try again");
                a = 1;
            }


        }




    }
}
