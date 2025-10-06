import javax.swing.*;
import java.net.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;

public class client {
    public static void main(String args[]) throws Exception {
        Socket soc;
        BufferedImage image = null;
        soc = new Socket("localhost", 4000);
        System.out.println("Client is running.");

        try {
            System.out.println("Reading image from disk.");
            image = ImageIO.read(new File("\"C:\\Users\\Lenovo\\Pictures\\Saved Pictures\\cute-puppy.jpg\""));

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "jpg", baos);
            baos.flush();
            byte[] bytes = baos.toByteArray();
            baos.close();

            System.out.println("Sending image to server.");
            OutputStream out = soc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            dos.writeInt(bytes.length);
            dos.write(bytes, 0, bytes.length);
            System.out.println("Image sent to server.");
            dos.close();
            out.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            soc.close();
        }
        soc.close();
    }
}