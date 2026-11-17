
class DLApplication {

    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();

        dl.takeAge();

        try {
            dl.verify();
        } /*catch (UnderAgeException e1) {
            e1.printStackTrace();
        } catch (OverAgeException e2) {
            e2.printStackTrace();
        }*/ catch (UnderAgeException | OverAgeException e) {
            e.printStackTrace();
        }
    }
}
