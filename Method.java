package lab08_code;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bok on 6/5/18.
 */
public class Method {
    private int byHand;
    private FileReader file;

    public Method() {
    }

    public Method(int byHand) {
        this.byHand = byHand;
    }

    public Method(FileReader file) {
        this.file = file;
    }

    public int getByHand() {
        return byHand;
    }

    public void setByHand(int byHand) {
        this.byHand = byHand;
    }

    public FileReader getFile() {
        return file;
    }

    public void setFile(FileReader file) {
        this.file = file;
    }

    public void printFile(FileReader file){
        char arr [] = new char[1024];
        int num = 0;
        try {
            while ((num=file.read(arr)) !=-1) {
                System.out.print(new String(arr,0,num));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Rolling Number is "  + byHand;
    }
}
