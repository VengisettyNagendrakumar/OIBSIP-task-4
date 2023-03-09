// online exam

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter username");
        String username = scanner.next();
        System.out.println("Password");
        String password = scanner.next();
        System.out.println("this is core concepts of java programming language related test");
        System.out.println("It contains Five questions");
        System.out.println("Each question carries one  mark and no negative mark");
        int count =0;
        int index= 0;
        boolean[] visited = new boolean[5];
        int timer =0;
        while(true) {
            timer++;
            index = index%5;
            System.out.println("1.Thread priority in Java is?");
            System.out.println("1.Integer" + "  " + "2.Float" + " " + "3.double" + " "  + "4.long");
            int n = scanner.nextInt();
            if(n == 1 && !visited[index]) {
                count++;
                visited[index] = true;
            }
            else {
                if(visited[index])  {
                    count--;
                    visited[index] = false;
                }
            }
            index++;
            System.out.println("2. Which of these are types of multitasking?");
            System.out.println("1.Process based" + "  " + "2.Thread based" + " " + "3.Process and Thread based" + "  " + "4.None of the mentioned");
            n = scanner.nextInt();
            if(n == 3 && !visited[index]) {
                count++;
                visited[index] = true;
            }
            else {
                if(visited[index])  {
                    count--;
                    visited[index] = false;
                }
            }
            index++;
            System.out.println("Multithreading is also called as .......");
            System.out.println("1.Concurrency" + " " + "2.Simultaneity" + "  " + "3.Crosscurrent" + "  " + "4.Recurrent");
            n = scanner.nextInt();
            if(n == 1 && !visited[index]) {
                count++;
                visited[index] = true;
            }
            else {
                if(visited[index])  {
                    count--;
                    visited[index] = false;
                }
            }
            index++;
            System.out.println("A single sequential flow of control within a program is");
            System.out.println("1.process" + " " + "2.Task" + " " + "3.Thread" + " " + "4.Structure");
            n = scanner.nextInt();
            if(n == 3 && !visited[index]) {
                count++;
                visited[index] = true;
            }
            else {
                if(visited[index])  {
                    count--;
                    visited[index] = false;
                }
            }
            index++;
            System.out.println("A method that must be overridden while extending threads");
            System.out.println("1.run()" + "  " + "2.start()" + " " + "3.stop()" + " " + "paint()");
            n = scanner.nextInt();
            if(n == 1 && !visited[index]) {
                count++;
                visited[index] = true;
            }
            else {
                if(visited[index])  {
                    count--;
                    visited[index] = false;
                }
            }
            index++;
            System.out.println("If you want to quit" + "press 123");
            n = scanner.nextInt();
            if(n == 123 || timer == 5) {
                break;
            }
        }
        System.out.println("you scored" + count);
    }
}