package lab08_code;

import java.io.File;

/**
 * Created by bok on 1/5/18.
 */
public class InputMethods {
    private int humanInput;
    private File file;

    public InputMethods(File file) {
        this.file = file;
    }

    public InputMethods(int humanInput) {
        this.humanInput = humanInput;
    }

    public int getHumanInput() {
        return humanInput;
    }

    public void setHumanInput(int humanInput) {
        this.humanInput = humanInput;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
