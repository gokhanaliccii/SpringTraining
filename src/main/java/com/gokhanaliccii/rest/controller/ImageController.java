package com.gokhanaliccii.rest.controller;


import com.sun.imageio.plugins.jpeg.JPEG;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

@RestController
@RequestMapping("/image")
public class ImageController {

    @RequestMapping(value = "/showImage", produces = "image/jpg")
    public @ResponseBody byte[] showImage() {
        InputStream is = getClass().getResourceAsStream("/image/test.png");

        try {
            BufferedImage img = ImageIO.read(is);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "jpg", baos);

            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping(value = "/putImage",method = RequestMethod.POST)
    public boolean storeFile(InputStream is) throws IOException {

        File file = new File("a.png");
        BufferedImage read = ImageIO.read(is);

        FileOutputStream fos = new FileOutputStream(file);

        ImageIO.write(read,"png",fos);


        return true;
    }

}
