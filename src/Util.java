import java.io.*;


public class Util {

    public static long size(String path) {

        File file = new File(path);

        if (file.isFile()) {
            return file.length();
        }
        if (file.isDirectory()) {
            long size = 0;
            File[] files = file.listFiles();

            for (File f : files) {
                size += size(f.getPath());
            }

            return size;
        }
        return 0;
    }


  public static long count(String path) {

        File file = new File(path);

        if (file.isFile()) {
            return 1;
        }
        if (file.isDirectory()) {
            long count = 0;
            File[] files = file.listFiles();

            for (File f : files) {
                count += count(f.getAbsolutePath());
            }
        
            return count;
        }
        return 0;
    }
}
