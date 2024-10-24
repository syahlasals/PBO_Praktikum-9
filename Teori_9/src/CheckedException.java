import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {

        String namaFile = "teks.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(namaFile));
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
