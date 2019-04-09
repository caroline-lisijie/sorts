package Select;

import shell.shell;

public class Select {//在为排序的数列中找到最小（大）的元素放在数列的起始位置，接着再从剩余的元素中找到最小（大）放在已排序数列的末尾，以此类推，直至结束。
    public void selectsort(int [] list){
        int n=list.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(list[j]<list[min])
                    min=j;
            }
            if(min!=i){
                int temp=list[min];
                list[min]=list[i];
                list[i]=temp;
            }
        }
    }
    public void printAll(int[] list) {
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {
                9, 1, 2, 5, 7, 4, 8, 6, 3, 5
        };
        Select s = new Select();
        System.out.print("排序前:\t\t");
        s.printAll(array);
        s.selectsort(array);
        System.out.print("排序后:\t\t");
        s.printAll(array);
    }
}
