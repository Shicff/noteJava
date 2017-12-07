public class CharTest{
    public static void main(String[] args){
       char aChar = 'a';
       char enterChar = '\r';
       char ch = '\u9999';
       System.out.println(aChar); 
       System.out.println(enterChar);
       System.out.println(ch);
      
       char zhong = '·è';
       System.out.println(zhong);
       int zhongValue = zhong;
       System.out.println(zhongValue);

       char c = 97;
       System.out.println(c);

       String s = "Äã²ÂÄã²ÂÄã²Â";
       System.out.println(s);       
}
}