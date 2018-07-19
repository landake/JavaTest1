public class Prim{
    public static void main(String[] args){

        int m = 101;
        int n = 200;
        int count = 0;
        StringBuffer arrPrime=new StringBuffer();
        //统计素数个数
        for(int i=m;i<n;i++){
            if(isPrime(i)){
                arrPrime.append(i+" ");
                count++;
            }
        }
            System.out.println("在"+m+"和"+n+"之间共有"+count+"个素数,分别是："+arrPrime);
        }

        //判断素数
        private static boolean isPrime(int n){
            boolean flag = true;
                for(int i=2;i<=Math.sqrt(n);i++){
                    if((n%i)==0 || n==1){
                        flag = false;
                        break;
                    }
                    else
                        flag = true;
                }

            return flag;
      }

}