package APLabs.SteganographyLab.StegStudentCode;
import java.awt.Color;
public class Stenography {

    public static void clearLow(Pixel p){
        int rLow = ((int)(p.getRed() / 4) * 4);
        int gLow = ((int)(p.getGreen() / 4) * 4);
        int bLow = ((int)(p.getBlue() / 4) * 4);

    }
    public static void main(String[] args){
        Picture beach = new Picture ("beach.jpg");
        beach.explore();
        Picture copy = testClearLow(beach);
        copy.explore();
    }
    public static Picture testClearLow(Picture q){
        int h = q.getHeight();
        int w = q.getWidth();
        clearLow(q.getPixel(h-2, w-2));
        return q;
    }
    //set the lower 2 bits in a pixel to the gighest 2 bits in c
    public static void setLow(Pixel p, Color c){
        int rLow = ((int)(p.getRed() / 4) * 4);
        int gLow = ((int)(p.getGreen() / 4) * 4);
        int bLow = ((int)(p.getBlue() / 4) * 4);

        int rNew = c.getRed() + rLow;
        int gNew = c.getGreen() + gLow;
        int bNew = c.getBlue() + bLow;

        c.c
    }

}
