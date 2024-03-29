package APLabs.SteganographyLab.StegStudentCode;
import java.awt.Color;
public class Stenography {

    public static void main(String[] args){
        Picture beach = new Picture ("beach.jpg");
        beach.explore();
        Picture copy = testClearLow(beach);
        copy.explore();

        Picture beach2 = new Picture("beach.jpg");
        beach2.explore();
        Picture copy2 = testSetLow(beach2, Color.PINK);
        copy2.explore();

        Picture copy3 = revealPicture(copy2);
        copy3.explore();

    }

    public static Picture testClearLow(Picture q){
        int h = q.getHeight();
        int w = q.getWidth();
        clearLow(q.getPixel(h-2, w-2));
        return q;
    }

    public static void clearLow(Pixel p){
        int rLow = ((int)(p.getRed() / 4) * 4);
        int gLow = ((int)(p.getGreen() / 4) * 4);
        int bLow = ((int)(p.getBlue() / 4) * 4);

    }

    //set the lower 2 bits in a pixel to the gighest 2 bits in c
    public static void setLow(Pixel p, Color c){
        int rLow = ((int)(p.getRed() / 12));
        int gLow = ((int)(p.getGreen() / 12));
        int bLow = ((int)(p.getBlue() / 12));

        int rNew = c.getRed() + rLow;
        int gNew = c.getGreen() + gLow;
        int bNew = c.getBlue() + bLow;


        c = new Color(rNew, gNew, bNew);  //i can figure this shi sout
    }
    public static Picture testSetLow(Picture p, Color c){

        for(int h = 0; h < p.getHeight(); h++){
            for(int w = 0; w < p.getWidth(); w++){
                setLow(p.getPixel(h, w), c);
            }
        }
        return p;
    }

    /*
    Sets the highest two bits of each pixel's colors to the lowest two bits of each pixels color
     */
    public static Picture revealPicture(Picture hidden){
        Picture copy = new Picture(hidden);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] source = hidden.getPixels2D();
        for(int r = 0; r < pixels.length; r++){
            for(int c = 0; c < pixels[0].length; c++){
                Color col = source[r][c].getColor();
                //to cheange the left most 2 bits, divide by four, add the 2 bits, multiply by four
                int rLow = (((int)(pixels[r][c].getRed() / 4) + (col.getRed() / 64))* 4);
                int gLow = (((int)(pixels[r][c].getGreen() / 4) + (col.getGreen() / 64)) * 4);
                int bLow = (((int)(pixels[r][c].getBlue() / 4) + (col.getBlue() / 64)) * 4);
            }
        }
        return copy;

    }
    public static boolean canHide(Picture source, Picture secret){
        if(source.getWidth() == secret.getWidth()){
            if(secret.getHeight() == source.getHeight())
                    return true;
        }
        return false;
    }

    public static Picture hidePicture(Picture source, Picture secret){
      Picture ans = new Picture();
       if(canHide(source, secret)){
           for(int h = 0; h < secret.getHeight(); h++){
               for(int w = 0; w < secret.getWidth(); w++){
                   Pixel pi = new Pixel(source, h, w);
                   Color c = new Color(pi.getRed(), pi.getGreen(), pi.getBlue());
                   testSetLow(secret, c);
               }
           }






       }



        return null;
    }
}
