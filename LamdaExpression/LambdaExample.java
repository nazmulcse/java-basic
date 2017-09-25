interface Voucher{
    public void voucherAmount();
}
public class LambdaExample{
    public static void main(String[] args){
        Voucher v = ()->{
            System.out.println("Total Voucher Amount : 20000.");
        };
        v.voucherAmount();
    }
}
