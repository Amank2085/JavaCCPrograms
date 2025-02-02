package ProgramsCC;

public class MemoryManagementJava {
    /*
    Difference between Heap and Stack Memory in java. And how
    java utilizes this.
    Stack memory is the portion of memory that was assigned to every individual
    program. And it was fixed. On the other hand, Heap memory is the portion that was
    not allocated to the java program but it will be available for use by the java program
    when it is required, mostly during the runtime of the program.

    Java Utilizes this memory as -
    When we write a java program then all the variables, methods, etc are stored in
    the stack memory.
    And when we create any object in the java program then that object was created
    in the heap memory. And it was referenced from the stack memory.
    */
    public void printArray(int[] array) {
        for (int i : array)
            System.out.println(i);
    }

    public static void main(String args[]) {
        int[] array = new int[10];
        MemoryManagementJava obj = new MemoryManagementJava();
        obj.printArray(array);
        /*
        Main and PrintArray is the method that will be available in the stack area and as well
        as the variables declared that will also be in the stack area.
        And the Object (Integer Array of size 10) we have created, will be available in the Heap
        area because that space will be allocated to the program during runtime

         Stack Memory:
           Local Variables:
              1.args (from main method)
              2.array (from main method)
              3.obj (instance of 'MemoryManagementJava' class created in main method)
              4.'i' (in the for loop inside printArray method)

          Method Call Stack Frames:
             1.The call to printArray from main.
             2.The main method's call frame itself.

        Heap Memory:
           Objects:
             1.new int[10]: The actual array of 10 integers is allocated on the heap.
             2.new MemoryManagementJava(): The instance of the 'MemoryManagementJava' class created in the main method.

        So, local variables and method call frames live on the stack, while objects like arrays and instances of classes are allocated on the heap.
         */
    }
}
