public class EnhahncedLoop{
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        System.out.println("By simple for loop");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++) {
        // use math library and random
                 arr[i][j]=(int)(Math.random()*10);
            }
            }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("By Enhanced for loop");
         //enhanced for loop
        for (int i[]:arr){
            for (int j: i){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
