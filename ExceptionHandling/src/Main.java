public class Main {
    public static void main(String[] args) throws StudentException {
        System.out.println("Program Başladı");
        int a = 0;
        try {
            a = 2 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program bitti");
        int arr[] = new int[5];
        /*arr[5]=4; out of bounds exception hatası verecek çünkü arrayi tanımlarken 5 tane
        elemanı var dedik ama atama yaparken index mantığını kullanırız.
        */
        try { //ayrı özel olarak bu şekilde de oluşturabiliriz hataları genel olarak da oluşturulabilir.

            arr[5] = 4;
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("0'a bölünme hatası");
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array boyut hatası");
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("Bir hata var");
            System.out.println(e.getMessage());
        } finally { //finally bölümüne her türlü girecek

            System.out.println("Finally bölümü");
        }
        Student s1 = Student.findStudent("12");
        try{
            String s="Enes";
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println(e.toString());
        }


        try
        {
            int data=50/0; //may throw exception

        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
