public class Main {

    public static void main(String[] args) {
        String filePath = "/home/swapnil/c/new/xyz";



        long fileSize =Util.size(filePath);
        long fileCount =Util.count(filePath);

        System.out.println("File Size: " + fileSize + " bytes");
        System.out.println("File Count: " + fileCount + " files");


    }
}