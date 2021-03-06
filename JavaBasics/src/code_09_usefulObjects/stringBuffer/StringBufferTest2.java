package code_09_usefulObjects.stringBuffer;

/**
 *  判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 *
 * 分析：
 * 		判断一个字符串是否是对称的字符串，我只需要把
 * 			第一个和最后一个比较
 * 			第二个和倒数第二个比较
 * 			...
 * 		比较的次数是长度除以2。
 */
public class StringBufferTest2 {
    public static void main(String[] args) {
        System.out.println(isSymmetry("aba")); //true
        System.out.println(isSymmetry2("aabbaa"));//true
    }

    //通过字符数组的方式来比较
    public static boolean isSymmetry(String s){
        boolean flag=true;
        char[] chs=s.toCharArray();
        int len=chs.length;
        for(int start=0,end=chs.length-1;start<=end;start++,end--){
            if(chs[start]!=chs[end]){
                flag=false;
                break;
            }
        }
        return flag;
    }

     //通过StringBuffer的reverse
    public static boolean isSymmetry2(String s){
        //通过StringBuffer的reverse获取反转字符串s2
        String s2=new StringBuffer(s).reverse().toString();
        return s2.equals(s);
    }
}
