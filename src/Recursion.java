public class Recursion {
        public static void main(String[] args) {
            int[] example = {1,2,3,4,5,6,7,8,9,10};
            System.out.println(findInd(example, 9));
            System.out.println(findInd(example, 0));
        }

        //this sets it to start always at index 0 to look for the number specified
        public static int findInd(int[] array, int number){
            return innerRecursionInd(array, number, 0);
        }

        public static int innerRecursionInd(int[] array, int number, int index){
            if (index == array.length){
                return -1;
            }
            if (number == array[index]){
                return index;
            }

            return innerRecursionInd(array, number, index+1);
        }
    }
