package lab08_code;

import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    public void run(){
        Manager manager = new Manager();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the method");
        int requireMethod = input.nextInt();
        System.out.println("input is " + requireMethod);
        if (requireMethod == 1){
            manager.setRollingStrategy(new Byhand());
            Method method = new Method();
            method.setByHand(requireMethod);
            manager.operation(method);
        } else if (requireMethod > 1){
            System.out.println("wrong");
        }




    }
}
