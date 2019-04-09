package Bubble;

public class Bubble {//从前到后依次比较相邻2个数的大小，若前>后，则交换顺序，一次遍历后，最大的元素到了数列的末尾。重复此操作，直到有序为止。
    public static void bubbleSort2(int[] a, int n) {
        int i,j;
        int flag;                 // 标记

        for (i=n-1; i>0; i--) {

            flag = 0;            // 初始化标记为0
            // 将a[0...i]中最大的数据放在末尾
            for (j=0; j<i; j++) {
                if (a[j] > a[j+1]) {
                    // 交换a[j]和a[j+1]
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;

                    flag = 1;    // 若发生交换，则设标记为1
                }
            }

            if (flag==0)
                break;            // 若没发生交换，则说明数列已有序。
        }
    }

    public static void main(String[] args) {
        int i;
        int[] a = {20,40,30,10,60,50};

        System.out.println("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.println("\n");

        bubbleSort2(a, a.length);

        System.out.println("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
    }
}
