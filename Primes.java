public class Primes {
    static boolean[] arr1 = new boolean[0];

    public static void main(String[] args) {
        // Replace this statement with your code
        final int N = Integer.parseInt(args[0]);
        arr1 = create_arr(N);
        num1();
        print_end(N);
    }

    public static boolean[] create_arr(int N) {
        boolean[] arr = new boolean[N + 1];
        for (int i = 2; i < N+1; i++) {
            arr[i] = true;
        }
        return arr;
    }

    public static void num1() {
        int index = 2;
        while (index < arr1.length) {
            
            if (arr1[index] == true) {
                //System.out.println("this is the number" + index);
                check_num(index);
                index++;
            } else {
                index++;
            }
        }
    }

    public static void check_num(int index) {
        int j = index + 1;
        while (j < arr1.length) {
            //System.out.println(index);
            //System.out.println(j);
            if (j % index == 0) {
                //System.out.println(j + " this is not p");
                arr1[j] = false;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void print_end(int N) {
        System.out.println("Prime numbers up to " + N + ":");
        //System.out.println(arr1[7]);
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == true) {
                counter++;
                System.out.println(i);
            }
        }
        int prectnge = counter * 100 / N;
        System.out.println("There are " + counter + " primes between 2 and " + N + " (" + prectnge + "% are primes)");

    }

}
