public class IsPalindrom {
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        String s= new StringBuffer(string).reverse().toString();
        if(x>=0&&s.equals(string)){
            return true;
        }
        return false;
    }
}
