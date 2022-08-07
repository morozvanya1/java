package Training;

public class LearnJavaException {

    public static void main(String[] args) throws Exception {

        int a = 4;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Деление на ноль");
        }

//        if (b == 0) {
//            throw new Exception("Деление на ноль");
//        }
//        System.out.println(a / b);
    }

}
