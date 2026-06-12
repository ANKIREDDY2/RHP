import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ctr=0;
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        for(int i=0;i<a;i++){
            l1.add(sc.nextInt());
        }
        for(int i=0;i<b;i++){
            l2.add(sc.nextInt());
        }
        Collections.sort(l1);
        Collections.sort(l2);
        for(int i=a-1,j=b-1;i>=0 && j>=0;){
            if(l2.get(j)<= 2*l1.get(i)){
                ctr++;
                i--;
                j--;
            }
            else{
                j--;
            }
        }
        System.out.println(ctr);
        
    }
}
