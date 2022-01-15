import java.io.*;
import java.util.*;
import java.util.zip.*;

public class ZipExample {
  static public void createZip(File path) throws IOException {
    File[] files = path.listFiles();
    if (files.length == 0) {
      throw new IllegalArgumentException();
    }

    FileOutputStream fos = new FileOutputStream("MyZip.zip");
    ZipOutputStream zos = new ZipOutputStream(fos);

    for (File f : files) {
      FileInputStream fis = new FileInputStream(f);
      ZipEntry ze = new ZipEntry(f.getName());
      int content;
      zos.putNextEntry(ze);
      while ((content = fis.read()) != -1) {
        zos.write(content);
      }
      fis.close();
    }

    zos.close();
    fos.close();
    System.out.println("\nCreated a zip file MyZip.zip");
  }

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    String file;

    System.out.println("\nEnter the location of files to be zipped: ");
    file = s.nextLine();
    createZip(new File(file));

    s.close();
  }
}