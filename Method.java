package lab08_code;

import java.io.File;

/**
 * Created by bok on 6/5/18.
 */
public class Method {
    private int byHand;
    private File file;

    public Method() {
    }

    public Method(int byHand) {
        this.byHand = byHand;
    }

    public Method(File file) {
        this.file = file;
    }

    public int getByHand() {
        return byHand;
    }

    public void setByHand(int byHand) {
        this.byHand = byHand;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
