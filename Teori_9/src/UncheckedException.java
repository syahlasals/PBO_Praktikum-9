public class UncheckedException {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}