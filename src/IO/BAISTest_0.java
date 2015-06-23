package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Created by Dmytro on 23.06.2015.
 */
public class BAISTest_0 {
    public static void main(String[] args) throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[]{0, 1, 2, 3, 4, 5, 6, 7});
        // read one byte
        int oneByte = in.read();
        System.out.println("(1): " + oneByte);
        // read full array
        byte[] array0 = new byte[2];
        int count0 = in.read(array0);
        System.out.println("(" + count0 + "): " + Arrays.toString(array0));
        // read interval in array
        byte[] array1 = new byte[10];
        int count1 = in.read(array1, 0, 8);
        System.out.println("(" + count1 + "): " + Arrays.toString(array1));
        // nothing to read
        System.out.println(in.read());
        System.out.println(in.read(new byte[10]));
        System.out.println(in.read(new byte[10], 5,2));

       //Runnable
    }
}
