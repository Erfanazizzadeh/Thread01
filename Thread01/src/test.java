import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
class Job {
    public static void jov(){
          try {

            Thread.sleep(10000);
          }catch (InterruptedException e) {
              e.printStackTrace();
          }
          }



}


// we want to add a clock
class clock implements  Runnable {
    String time;
    Calendar calendar = Calendar.getInstance();

    SimpleDateFormat timee = new SimpleDateFormat("hh:mm:ss a");

    @Override
    public void run() {

            while (true) {
                time = timee.format(Calendar.getInstance().getTime());
                System.out.println(time);
            Job.jov();
        }
    }
}
class informations implements Runnable {
    String name;
    int age;
Scanner scan = new Scanner(System.in);


    // give the namae and age ;
    public void information(){
        System.out.println("Enter your name :  ");
        name = scan.next();
        Job.jov();
        System.out.println("Enter your age :  ");
        age = scan.nextInt();
        System.out.println("your name is : "+ name);
        Job.jov();
        System.out.println("your age is : "+ age);

    }

    @Override
    public void run() {
        information();
    }
}

public class test {
    public static void main(String[] args) {
        // we want create the simple app to give the name and age
        new Thread(new informations()).start();
        Job.jov();
        new Thread(new clock()).start();
    }
}
