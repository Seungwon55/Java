package ch9;

public class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        int i = fullPath.lastIndexOf("\\");
        path = fullPath.substring(0, i);
        fileName = fullPath.substring(i + 1);

        System.out.println("fullPath : " + fullPath);
        System.out.println("path : " + path);
        System.out.println("fileName : " + fileName);
    }
}
