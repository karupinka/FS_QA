public class Main {

    public static void main(String[] args) {

        boolean isEnd = false;
        int numOfBottle = 99;

        System.out.println("Song about bottles of beer");
        System.out.println("===========================");
        while(!isEnd) {
            if(numOfBottle==1){
                System.out.println(numOfBottle + " bottle of beer on the wall,");
                System.out.println(numOfBottle + " bottle of beer!");
                System.out.println("Take one down, pass it around,");
                System.out.println("No more bottles of beer on the wall,");
                System.out.println("--------------------------------");
                numOfBottle--;
            }

            else if(numOfBottle==0){
                System.out.println("No more  bottles of beer on the wall,");
                System.out.println("No more  bottles of beer!");
                System.out.println("Go to the store and buy some more,");
                System.out.println("99  bottles of beer on the wall!");
                isEnd = true;
            }
            else {
                System.out.println(numOfBottle + " bottles of beer on the wall,");
                System.out.println(numOfBottle + " bottles of beer!");
                System.out.println("Take one down, pass it around,");
                if(numOfBottle!=2)
                    System.out.println(--numOfBottle + " bottles of beer on the wall,");
                else
                    System.out.println(--numOfBottle + " bottle of beer on the wall,");
                System.out.println("--------------------------------");
            }
        }
    }
}
