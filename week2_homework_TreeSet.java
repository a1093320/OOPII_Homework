import java.util.*;
public class week2_homework_TreeSet {
    public static void main(String[] args) throws Exception {
        Random random=new Random();
        int [] arr=new int[10];
        int index=0;
        boolean number=false;
        while(index<arr.length){
            int num=random.nextInt(101);
            if(num!=0){
                for(int a=0;a<arr.length;a++){
                    if(arr[a]==num){
                        number=false;
                        break;
                    }
                    else{
                        number=true;
                    }
                }
            }
            if(number==true){
                arr[index++]=num;
            }
        }
        for(int a=0;a<arr.length;a++){
            int n=a+1;
            System.out.println("第"+n+"個號碼:"+arr[a]);
        }
        var ts=new TreeSet<>();
        for (int n:arr){
            ts.add(n);
        }
        var indiv=new TreeSet<>();
        for (int j:arr){
            if(j>=30&&j<=70){
                indiv.add(j);
            }
        }
        System.out.println("物件內元素個數為:"+ts.size());
        System.out.println("物件內元素的內容:"+ts);
        System.out.println("第一個元素內容:"+ts.first());
        System.out.println("最後一個元素內容:"+ts.last());
        System.out.println("內容介於30~70者:"+indiv);
    }
}
        
        