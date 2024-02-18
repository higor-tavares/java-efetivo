package com.higortavares.cap2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
  private static final int BUFFER_SIZE = 8;
  public static void copy(String source, String destination) throws IOException {
    try(InputStream in = new FileInputStream(source);
    OutputStream out = new FileOutputStream(destination)){
      byte[] buffer =  new byte[BUFFER_SIZE];
      int n;
      while((n = in.read(buffer)) >= 0){
        out.write(buffer, 0, n);
      }
    }
  }
}
