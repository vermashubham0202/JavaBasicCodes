package com.pidkui.qrcode_demo;

/*
111-Program to generate QR Code from text in Java.
*/

//library to generate QR codes
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QRCodeGenerator {
    public static void main(String[] args) throws Exception {
        String details = "Shubham Verma : +91-75xxxxxx55";

        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();

        File f = new File("/home/shubham/idea-workspace/JavaBasicCodes/inputOutputFiles/MyDetailsQR.jpg");
        FileOutputStream fos = new FileOutputStream(f);

        fos.write(out.toByteArray());
        fos.flush();
    }
}
