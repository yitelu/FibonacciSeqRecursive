import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    //1,1,2,3,5,8,13,21,34,55, .....

    ArrayList<Integer> arr = new ArrayList<>();

    int targetFib = 10;
    System.out.println("Here's the Fibonacci numers at index: " + targetFib);

    while(targetFib >=1){
      arr.add(Fib(targetFib));
      targetFib--;
    }
    System.out.println(" ");

    int num = arr.size()-1;
    System.out.print("Here's the entire Fib: ");
    while(num>=0){
      System.out.print(arr.get(num)+ " ");
      num--;
    }
  }

  public static int Fib(int num){

    // if(num <= 0){
    //   return 0;
    // }
    // else if (num == 1){
    //   return 1;
    // }
    // else{
    //   return Fib(num-2)+Fib(num-2);
    // }

    if(num >= 3){
      return (Fib(num-1) + Fib(num-2));
    }
    else{
      return 1;
    }


  }

}