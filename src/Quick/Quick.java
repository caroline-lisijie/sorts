package Quick;


import shell.shell;

public class Quick {//选择一个基准数，通过一趟排序将待排序数组分成两个部分，其中一部分的所有数据比另一部分的所有数据要小，然后分别对这两部分在进行快速排序，直到结束。
    public void quicksort(int [] list,int l,int r){
        if(l<r){
            int i=l;
            int j=r;
            int temp=list[i];
            while(i<j){
                while(i<j && list[j]>temp)
                    j--;
                if(i<j)
                    list[i++]=list[j];
                while(i<j && list[i]<temp)
                    i++;
                if(i<j)
                    list[j--]=list[i];
            }
            list[i]=temp;
            quicksort(list,l ,i-1);
            quicksort(list,i+1,r);
        }
    }
    public void printAll(int[] list) {
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {9, 1, 2, 5, 7, 4, 8, 6, 3, 5};
        int n=array.length;
        Quick q = new Quick();
        System.out.print("排序前:\t\t");
        q.printAll(array);
        q.quicksort(array,0,n-1);
        System.out.print("排序后:\t\t");
        q.printAll(array);
    }
}
