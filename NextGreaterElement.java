package dsa1;
public class NextGreaterElement {
    public static void NextGreater(int[] arr){
        boolean flag;
    for(int i=0;i<arr.length;i++) {
        flag = false;
        int temp = arr[i];
        for(int j=i+1;j<arr.length;j++) {
            if(temp<arr[j]) {
                arr[i] = arr[j];
                flag = true;
                break;
            }
        }
        if(!flag) {
            arr[i] = -1;
        }
    }
    for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
    }

    }

    public static void main(String[] args) {
        int[] arr=new int[4];
        arr[0]=13;
        arr[1]=7;
        arr[2]=11;
        arr[3]=12;
        NextGreater(arr);

    }
}
