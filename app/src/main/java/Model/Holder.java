package Model;

/**
 * Created by hemanth on 20/10/16.
 */

public class Holder {

     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private int image;
    public Holder(int back, String hemanth) {
        this.image = back;
        this.name=hemanth;

    }
}
