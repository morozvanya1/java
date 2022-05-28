package CodingBat;

public class Print {

    public void printAllInConsole(String firstResult, String correctFirst, String secondResult, String correctSecond, String thirdResult, String correctThird){
        if (firstResult.equals(correctFirst)) {
            System.out.println("First result success - '" + firstResult + "'");
        } else {
            System.out.println("First result incorrect -> '" + firstResult + "', correctly -> '" + correctFirst + "'");
        }
        if (secondResult.equals(correctSecond)) {
            System.out.println("Second result success - '" + secondResult + "'");
        } else {
            System.out.println("Second result incorrect -> '" + secondResult + "', correctly -> '" + correctSecond + "'");
        }
        if (thirdResult.equals(correctThird)) {
            System.out.println("Third result success - '" + thirdResult + "'");
        } else {
            System.out.println("Third result incorrect -> '" + thirdResult + "', correctly -> '" + correctThird + "'");
        }
    }

}
