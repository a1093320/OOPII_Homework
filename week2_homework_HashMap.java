import java.util.*;
public class week2_homework_HashMap {
    private static Object put;

    public static void main(String[] args) throws Exception {
        var month=new HashMap<>();
        month.put("1","January");
        month.put("2","February");
        month.put("3","March");
        month.put("4","April");
        month.put("5","May");
        month.put("6","June");
        month.put("7","July");
        month.put("8","August");
        month.put("9","September");
        month.put("10","October");
        put = month.put("11","November");
        month.put("12","December");
        System.out.print("請輸入1~12? ");
        Scanner input=new Scanner(System.in);
        String keyboard=input.nextLine();
        while(month.get(keyboard)==null){
            System.out.println("範圍錯誤!");
            System.out.print("請輸入1~12? ");
            keyboard=input.nextLine();
        }
        System.out.println("第"+keyboard+"月的英文單字為 "+month.get(keyboard));
    }
        
}

