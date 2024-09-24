class Human{
    public void job(){
        System.out.println("Workimg Professional");}}
class Teacher extends Human{
    public void job(){
        System.out.println("Teacher");}}
class Doctor extends Human{
    public void job(){
        System.out.println("Doctor");}}


public class K7{
    public static void main (String[]args){
        Human amar=new Human();
        Teacher boaz =new Teacher();
        Doctor Bhaskar =new Doctor();
        Human dinesh =new Doctor();
        amar.job();
        boaz.job();
        Bhaskar.job();
        dinesh.job();
     }
}
