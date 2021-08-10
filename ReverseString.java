class Reverse
{
   public static String reverseWord(String str)
    {
        int len = str.length();
        String s ="";
        for(int i=len-1;i>=0;i--){
            s += str.charAt(i);
        }
        return s;
    }
}
