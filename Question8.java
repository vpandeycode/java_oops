final class SecurityManager {
    void encrypt() {
        System.out.println("Data encrypted.");
    }

    void decrypt() {
        System.out.println("Data decrypted.");
    }

    void validateToken() {
        System.out.println("Token is valid.");
    }
}

public class Question8 {
    public static void main(String[] args) {
        SecurityManager security = new SecurityManager();

        security.encrypt();
        security.decrypt();
        security.validateToken();
    }
}

/*
class MySecurity extends SecurityManager {
}

// This gives an error because SecurityManager is final.
*/