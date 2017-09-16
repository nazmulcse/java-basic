public class OutputFormatter{
    public static void main(String[] args){
        /*
        ("%-15s%03d%n", s1, x) % : used as a formatter. '-' : minus sign used for left indentation of the string.
        15s : here 15 denotes the string's minimum field width 15. '0' : pads the extra 0s in the integer.
        3d : here 3 denotes integer's minimum field width 3. %n
        */
        String s = "Nazmul";
        int n = 2;
        System.out.printf("%-15s%03d",s,n);
    }
}
