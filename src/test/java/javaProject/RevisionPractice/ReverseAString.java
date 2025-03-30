package RevisionPractice;

public class ReverseAString {
    public static void main(String[] args)
    {
        String str = "Swap";
//        String rev = "";
//
//        for(int i = str.length()-1; i >= 0; i--)
//        {
//            rev = rev+str.charAt(i);
//        }
//        System.out.println(rev);

        // Logic 2
//        StringBuffer sb = new StringBuffer(str);
//        StringBuffer rev = sb.reverse();
//        System.out.println(rev);

        // Logic 3
        StringBuilder sbd = new StringBuilder();
        sbd.append(str);
        System.out.println(sbd.reverse());

    }
}
