import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("HEllo");
//        char b = 'c';
//        int a = 10;
//        int a = 3;
//        long b=2;
//        long c = (long)a+b;
//        System.out.println(c);

//        String s ="Hello, world!";
//        String s1 =" A bo co ";
//        float a= 10;
//        String result = s + s1 +a ;
//
//        System.out.println(result);


//        int a=3;
//        if(a<=3)
//            System.out.println("abc");
//        else if (!(a==4)) {
//            System.out.println("xyz");
//        }
//        else {
//            System.out.println("123");
//        }


//        boolean result = true;
//        if (!result){
//
//        }else{
//
//        }

//        int a= 3
//        String s1 = "Ahihi";
//        String s2= "Hiaaa";
////        if ((s1==s2)||(a===3)){
//        if ((s1==s2)&&(a===3)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }

//
//        int a =3;
//        switch (a){
//            case 1 & 2 :
//                System.out.println("1");
//                break; // ngat cau lenh de ko kiem tra cac case tiep theo
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default:
//                // neu cac case ko thoa man se nhay vao day
//                System.out.println("Erorr");
//                break;
//        }

        //loop
//        for(int i = 0; i<6; i+=2)

//        for (int i = 5; i > 0; i--){
//            System.out.println(i);
//
//        }

//        int i = 0;
//        while (i<5){
//            System.out.println(i);
//            i++;
//
//        }

//        int i = 0;
//        do{
//            i++;
//            System.out.println(i);
//        }while(i<5);


//        while(true){
//            break; //thoat khoi vong lap
//        }
//        while(true){
//            return; //  dung toan bo chuong trinh phia sau
//        }
//        while(true){
//            continue;
//        }

        // mang tinh
//        int[] array = new int[10];
//        int[] list = {1,2,3,4,5};
////        array[0] = 1;
////        array[1]= 2;
//        for (int i = 0; i <array.length; i++){
//            array[i]= i; // gan
//            int a = array[i]; // lay
//        }
//
//        for (int i = 0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
//
//        for (int element:array) {
//            System.out.println(element);
//        }
//
//        //mang dong
//        List<String> list = new ArrayList<>()
//        list.add("a");
//        list.add("b");
//        list.add("c")
//        list.add(4,"d");
//        String string = list.get(0);
//        // cach lay phan tu 1
//        for (int i =0; i<list.size(); i++){
//
//        }
//        // cach lay phan tu 2
//        for (String string: list){
//
//        }

        String [][] array =new  String [4][4];
//        String[] [] list = {
//                {"*","*"},
//                {"*","*"},
//        }
        int[] player = {1,1};

        while(true){
            for (int i = 0; i <array.length; i++ ){
                for(int j = 0; j <array[i].length; j++){
                    boolean is_p = false;
                    if(i== player[0] && j== player[1]){
                        System.out.print("P");
                        is_p = true;
                    }
                    if (!is_p){
                        System.out.print('*');
                    }
                }
                System.out.println();
            }

            Scanner scanner = new Scanner(System.in);
            String move = scanner.next();
            System.out.println(move);

            int dx =0;
            int dy =0;

//            if (move.equalsIgnoreCase("a") ){
//                dx = -1;
//                System.out.println(dx);
//            }
//            else if (move.equalsIgnoreCase("d")){
//                dx = 1;
//            }
//            else if (move.equalsIgnoreCase("w")){
//                dy =1;
//            }
//            else if (move.equalsIgnoreCase("s")){
//                dy = -1;
//            }


            switch (move){
            case "a" :
                dx = -1;
                break; // ngat cau lenh de ko kiem tra cac case tiep theo
            case "d":
                dx = 1;
                break;
            case "s":
                dy =1;
                break;
            case "w":
                dy = -1;
                break;
            }

            player[0] = player[0] + dx;
            player[1] = player[1] + dy;


        }


    }
}
