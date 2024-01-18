public class Conditionals {
    public static void main(String[] args) {
        /*
           Syntax of if statements:
           :if (boolean expression T or F) {
               // body
           }else{
               // do this
           }
        */

        int salary = 28600;
        if (salary > 20000) {
            salary = salary + 3000;
        }else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        // multi if else
        int FirstPersonSalary = 16000;
        if (FirstPersonSalary > 40000) {
            FirstPersonSalary += 10000; // shortcut FirstPersonSalary = FirstPersonSalary + 10000;
        } else if (FirstPersonSalary > 30000) {
            FirstPersonSalary += 5000;
        } else {
            FirstPersonSalary += 3000;
        }
        System.out.println(FirstPersonSalary);
    }
}