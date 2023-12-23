public class Main{
    public static void main(String[] args){
        int row = 6;
        for(int i = 1;i <= row;i++){
            for(int k = 0; k < row - i;k++){
                System.out.print(" ");
            }
            if(i == 1 || i == row){
                for(int j = 1;j <= i;j++){
                    System.out.print("*");
                }
                for(int l = 2;l <= i;l++){
                    System.out.print("*");
                }
            }else{
                for(int j = 1;j < i;j++){
                    if(j == 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                for(int l = 1;l <= i;l++){
                    if(l == i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
