package hw7;

public class Block {

    int width, length, height;

    public Block(int [] sides) {
        this.width = sides[0];
        this.length = sides[1];
        this.height = sides[2];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume(){
        return width * length * height;
    }
    public int getSurfaceArea(){
        return 2 * (width*length + length*height + width*height);
    }

}
