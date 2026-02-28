package Arrays;
public class E2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1] = 40;
        System.out.println(arr[1]);
// Access & Update elements in an array -> TC 0(1)
// This is because of index-based access or  direct index-mapping [idx = pos -1] or [pos = idx + 1]
for (int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
}
        System.out.println();
for (int x : arr){
    System.out.println(x + " ");
}
        System.out.println();
for (Object o : arr){
    System.out.println(o + " ");
}
        System.out.println();
String name = "Java";
        System.out.println(name.length()); // length() method
}
}
/*
✅array.length is a property
✅string.length() is a method
😎Memory Management
👉Array object is stored in the heap
👉Variable reference is stored in the stack
👉Elements are stored in contiguous memory blocks
🟢char[1][1][1][1] int[4][4][4][4] double[8][8][8][8] bytes
 */

