public class Student extends Person{
    final int studentId;


    Student (String name ,String surname,int studentId){
        super(name,surname);
        this.studentId=studentId;
    }
    public int hashCode(){
        return super.hashCode() ^ studentId;

    }
    public String toString (){
      //  return name + " " + surname + " / " + studentId; bu kullanım da doğrudur override etmek için toString methodunu ama
        return super.toString() + " / " + studentId; /*
         bu kullanım daha iyidir super.toString yaparak Student classının superclassından toString methodunu
        çekip üstüne override yaptık*/
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        else{
            Student s =(Student)obj;
            return (super.equals(s) && this.studentId == s.studentId);

        }

    }
}
