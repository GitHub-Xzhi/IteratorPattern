public class Main {

    public static void main(String[] args) {
        String str = "lllllllllleeeeeeee:etttt:ttttt";
        String[] split = str.split(":");
        if (str.contains("::"))
        {
            System.out.println(str.split("::")[1]);
        }else {
            System.out.println(split[1]);
//            str.inde
//            str.substring()
        }

        String s="30.6.9";
        System.out.println(">>>"+s.substring(0,s.indexOf(".",s.indexOf(".")+1)));

    }
}
