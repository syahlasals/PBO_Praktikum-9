class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Registrasi {

    public void registerUser(int usia) throws InvalidAgeException {
        if (usia < 17) {
            throw new InvalidAgeException("Usia minimal tidak sesuai, dibawah 17! usia anda: " + usia);
        }
        System.out.println("Pendaftaran berhasil! Usia Anda: " + usia);
    }

    public static void main(String[] args) {        
        try {
            Registrasi reg = new Registrasi();
            reg.registerUser(16);
            reg.registerUser(21);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
