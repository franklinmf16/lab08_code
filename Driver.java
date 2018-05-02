package lab08_code;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bok on 30/4/18.
 */
public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    public void run(){
        Storage storage;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the method");
        int method = input.nextInt();

        if(method == 1){

            int inputNum = input.nextInt();
            InputMethods methods = new InputMethods(inputNum);
            storage = new Storage(new Byhand(methods));

        } else if(method == 2){
            storage = new Storage(new ByFile());
        }


    }
}
