package com.kevin.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Append Data To File.
 * Created by Kevin on 2016/9/2.
 */
public class AppendDataToFile {

    public static void main(String[] args) throws IOException {

        String appendString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+ " hello world" + System.lineSeparator();
        byte[] data = appendString.getBytes();
        //If the second argument is true, then bytes will be written to the end of the file rather than the beginning.
        FileOutputStream fos = new FileOutputStream("C:\\temp\\test.txt",true);
        fos.write(data);
        fos.close();

    }

}
