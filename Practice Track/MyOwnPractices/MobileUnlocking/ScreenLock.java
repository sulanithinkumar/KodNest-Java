
public class ScreenLock {

    void unlocking(String password) {

        System.out.println("Unlocked by password");

    }

    void unlocking(int pin) {

        System.out.println("Unlocked by PIN");

    }

    void unlocking(Pattern p) {

        System.out.println("Unlocked by Pattern");

    }

    void unlocking(Face f) {

    }

    void unlocking(FingerPrint fp) {

    }

}
