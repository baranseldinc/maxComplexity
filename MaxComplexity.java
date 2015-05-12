
package maxcomplexity;

import java.util.Random;

public class MaxComplexity {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] dizi = new int[20];
        for(int i=0;i<dizi.length;i++) {
            dizi[i] = rand.nextInt(20);
        }
        int enbuyuk = dizi[0];
        int i;
        for(i = 0;i<dizi.length;i++) {
            if(dizi[i] > enbuyuk) enbuyuk = dizi[i];
        }
        System.out.println(enbuyuk);
        
    }
    
}
