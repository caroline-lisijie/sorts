package Insert;

public class Insert {//将n个带排序的元素看成一个有序表和一个无序表，开始时，有序表只包含一个元素，无序表包含n-1个元素，每次排序将无序表中的第一个元素插入有序表中，直到结束。
    public void insert(int [] list){
        int n=list.length;
        for(int i=1;i<n;i++){
            int j=0;
            int temp=list[i];
            for(j=i-1;j>=0&&list[j]>temp;j--){
                list[j+1]=list[j];
            }
            list[j+1]=temp;
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
        // 调用直接插入排序方法
        Insert in = new Insert();
        System.out.print("排序前:\t\t");
        in.printAll(array);
        in.insert(array);
        System.out.print("排序后:\t\t");
        in.printAll(array);
    }
}
