import java.io.*;

public class Copy {
    public static void main(String[] args)
            throws IOException
    {
        FileInputStream source = null;
        FileOutputStream target = null;

        try {

            source = new FileInputStream(
                    "C:\\Users\\Thanh Tu\\IdeaProjects\\bai16-baitap1\\src\\source file");

            target = new FileOutputStream(
                    "\\\\Users\\\\Thanh Tu\\\\IdeaProjects\\\\bai16-baitap1\\\\src\\\\target file");

            int c;
            while ((c = source.read()) != -1) {
                target.write(c);
            }
            System.out.println("Đã copy thành công");
        }
        finally {
            if (source != null) {
                source.close();
            }
            if (target != null) {
                target.close();
            }
        }
    }
}
