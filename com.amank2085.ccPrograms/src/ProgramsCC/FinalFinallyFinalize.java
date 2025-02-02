package ProgramsCC;

public class  FinalFinallyFinalize {
    public final void finalMethodCheck()
    {
        System.out.println("Final Method Inheritance is restricted");
    }

    /*
    Finally: It is the block present in a program where all the codes written inside it get
    executed irrespective of handling of exceptions.
     */
    public static void test1()
    {
        try{
            System.out.println("Inside test1 method");
            throw  new RuntimeException();
        }catch (RuntimeException ex)
        {
            System.out.println("Inside catch block : "+ ex.getMessage());
        }finally {
            System.out.println("Inside Finally");
        }
    }

    public void finalize()
    {
        System.out.println("Finalize method called");
    }



    public static void main(String[] args) {
        /*
        Final: If any restriction is required for classes, variables, or methods, the final
        keyword comes in handy. Inheritance of a final class and overriding of a final method
        is restricted by the use of the final keyword. The variable value becomes fixed aer
        incorporating the final keyword. Example:
         */

        final int a=100;
//        a = 0; // error

         test1();

         /*
         Finalize: Prior to the garbage collection of an object, the finalize method is called so
         that the clean-up activity is implemented.
          */
        FinalFinallyFinalize f1 = new FinalFinallyFinalize();
        FinalFinallyFinalize f2 = new FinalFinallyFinalize();
        f1 = null; // finalize() method will be called for cleanup process
        f2 = null;
        System.gc(); // Garbage collector called

        /*
        Final : is a keyword
        Finally : is a block
        Finalize : is a method
         */
    }


}

//Cannot inherit from final 'ProgramsCC. FinalFinallyFinalize'
class ChildClass extends FinalFinallyFinalize
{
//    'finalMethodCheck()' cannot override 'finalMethodCheck()' in 'ProgramsCC. FinalFinallyFinalize'; overridden method is final
//    public void finalMethodCheck()
//    {
//        System.out.println("Final Method Inheritance is restricted");
//    }
}

