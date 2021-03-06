package code_09_usefulObjects.integer;

/**
 * int类型和String类型的相互转换:
 * int -- String
 * 		String.valueOf(number)
 *
 * String -- int
 * 		Integer.parseInt(s)
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        System.out.println(intToString(100));
        System.out.println(stringToInt("100"));
    }

    //int --> String
    public static String intToString(int number) {
        //方式一
        /*String strNumber=""+number;
        return strNumber;*/
        //方式二
        String strNumber=String.valueOf(number);
        return strNumber;
    }

    //String --> int
    public static int stringToInt(String strNumber) {
        //方式一
        /*Integer number=new Integer(strNumber);
        return number;*/
        //方式二
        Integer number=Integer.parseInt(strNumber);
        return number;
    }
}
