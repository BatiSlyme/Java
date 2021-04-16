public class Codenavirus {

    public static void main(String[] args) {
        int[] person = {1, 0};
        int count=0;


        char[][] world = {{'H', 'H', 'H'}, {'H', 'H', 'H'},
                {'H', 'H', 'H',}};

        int n = person[0];
        int m = person[1];
        for (int i = 0; i < 3; i++) {
            if (n == 0 && m == 0) {//top-left

                if (world[n][m] == 'H') {
                    world[n][m] = 'I';
                 //   Recursive(world, 0, 0);

                } else if (world[0][1] == 'H') {//right
                    world[0][1] = 'I';
                //    Recursive(world, 0, 1);
                } else if (world[1][0] == 'H') {//bot
                    world[1][0] = 'I';
                   // Recursive(world, 1, 2);
                }
            } else if (n == 0 && m == 1) {//top
                if (world[n][m] == 'H') {
                    world[n][m] = 'I';
                    //  Recursive(world,0,1);
                } else if (world[0][1] == 'H') {//right
                    world[0][1] = 'I';
                    //  Recursive(world,1,2);
                } else if (world[0][0] == 'H')//left
                    world[0][0] = 'I';
                else if (world[1][1] == 'H')//bottom
                    world[1][1] = 'I';
            } else if (n == 0 && m == 2) {//top-right
                if (world[n][m] == 'H') {
                    world[n][m] = 'I';
                    //  Recursive(world,0,2);
                } else if (world[0][1] == 'H')//left
                    world[0][1] = 'I';
                else if (world[1][2] == 'H')//bot
                    world[1][2] = 'I';
   /* =================================================================   */
                } else if (n == 1&& m == 0) {//  LEFT
                if (world[n][m] == 'H')
                    world[n][m] = 'I';
                else if (world[1][1] == 'H') {//right

                    world[1][1] = 'I';
                    Recursive(world,1,1,count);
                }
                else if (world[0][0] == 'H')//top
                    world[0][0] = 'I';
                else if (world[2][0] == 'H')//bottom
                    world[2][0] = 'I';
            } else if (n == 1 && m == 1) {//center
                if (world[n][m] == 'H') {
                    world[n][m] = 'I';
                //    Recursive(world, 1, 1);
                } else if (world[1][2] == 'H') {//right
                    System.out.println("center-right");
                    world[1][2] = 'I';
                    Recursive(world, 1, 2,i);
                } else if (world[0][1] == 'H') {//top
                    world[0][1] = 'I';
                    Recursive(world, 0, 1,i);
                } else if (world[1][0] == 'H') {//left
                    world[1][0] = 'I';
                    Recursive(world, 1, 0,i);
                } else if (world[2][1] == 'H') {//bottom
                    world[2][1] = 'I';
               //     Recursive(world, 2, 1);
                }
            } else if (n == 1 && m == 2) {//RIGHT
                if (world[n][m] == 'H') {
                    world[n][m] = 'I';
           //         Recursive(world, n, m);
                } else if (world[0][2] == 'H')//top
                    world[0][2] = 'I';
                else if (world[1][1] == 'H')//left
                    world[1][1] = 'I';
                else if (world[2][2] == 'H')//bottom
                    world[2][2] = 'I';


/*=========================================================================    */

            } else if (n == 2 && m == 0) {//bottom left
                if (world[n][m] == 'H')
                    world[n][m] = 'I';
                else if (world[2][1] == 'H')//right
                    world[2][1] = 'I';
                else if (world[1][0] == 'H')//top
                    world[1][0] = 'I';
            } else if (n == 2 && m == 1) {//bottom
                if (world[n][m] == 'H')
                    world[n][m] = 'I';
                else if (world[2][2] == 'H')//right
                    world[2][2] = 'I';
                else if (world[1][1] == 'H')//top
                    world[1][1] = 'I';
                else if (world[2][0] == 'H')//left
                    world[2][0] = 'I';
            } else if (2 == 0 && m == 2) {//bottom-right
                if (world[n][m] == 'H')
                    world[n][m] = 'I';
                else if (world[1][2] == 'H')//top
                    world[1][2] = 'I';
                else if (world[2][1] == 'H')//left
                    world[2][1] = 'I';
            }

            count=i;
        }
        for (int rolls = 0; rolls < world.length; ++rolls) {
            for (int columns = 0; columns < world[rolls].length; ++columns) {
                System.out.print(world[rolls][columns] + " ");
            }
            System.out.println();
        }



    /*    int n = person[0] + 1;//usera ne znae 4e ima nuli
        int m = person[1] + 1;
        System.out.println(world[2][2]);
        System.out.println(n + "n m" + m);
        int counter = 0;
        if (world[n][m] == 'H') {
            world[n][m] = 'I';
            for (int k = 0; k < 2; k++) {
                System.out.println();
                System.out.println("day" + k);
                System.out.println(world[n][m]);
                System.out.println();
                for (int rolls = 0; rolls < world.length; ++rolls) {
                    for (int columns = 0; columns < world[rolls].length; ++columns) {
                        System.out.print(world[rolls][columns] + " ");
                    }
                    System.out.println();

                if (k >= 2 && world[n][m] == 'I') {
                    world[n][m] = 'R';


                } else if (world[n][m + 1] == 'H'){//right
                    //array(world, n, m + 1, n);
                    world[n][m + 1] = 'I';
                    continue;

                }

                if (k >= 3 && world[n][m + 1] == 'I') {
                    world[n][m + 1] = 'R';

                } else if (world[n - 1][m] == 'H') //top
                {
                    //array(world, n - 1, m, k);
                    world[n - 1][m] = 'I';
                    continue;
                }
                if (counter >= 4 && world[n - 1][m] == 'I') {
                    world[n - 1][m] = 'R';


                } else if (world[n][m - 1] == 'H')//left
                {
                    //array(world, n, m - 1, k);
                    world[n][m - 1] = 'I';
                    continue;

                }
                if (k >= 5 && world[n][m - 1] == 'I') {
                    world[n][m - 1] = 'R';


                } else if (world[n + 1][m] == 'H')//bottom
                {
                    //array(world, n + 1, m, k);
                    world[n + 1][m] = 'I';

                    continue;
                }

                if (k >= 6 && world[n + 1][m] == 'I') {
                    world[n + 1][m] = 'R';

                }


                }

            }

        }*/
    }

/*    public static void array(char[][] world,int n,int m,int i) {


        if (world[n][m] == 'H') {
            world[n][m] = 'I';
            for (int k = 0; k < 4; k++) {

                if (k > 2 && world[n][m + 1] == 'I') {//right
                    world[n][m + 1] = 'R';
                } else if (world[n][m + 1] == 'H') {//right
                    world[n][m + 1] = 'I';
                    //array(world,n,m+1,k);
                }
                if (k > 3 && world[n - 1][m] == 'I') {//top
                    world[n - 1][m] = 'R';

                } else if (world[n - 1][m] == 'H') {//top
                    world[n - 1][m] = 'I';
                    //array(world,n-1,m,k);
                }

                if (k > 4 && world[n][m - 1] == 'I')//left
                {
                    world[n][m - 1] = 'R';
                } else if (world[n][m - 1] == 'H') {//left
                    world[n][m - 1] = 'I';
                    //array(world,n,m-1,k);
                }
                if (k > 5 && world[n + 1][m] == 'I')//bot
                {
                    world[n + 1][m] = 'R';
                } else if (world[n + 1][m] == 'H') {//bottom
                    world[n + 1][m] = 'I';
                    //array(world,n+1,m,k);
                }
            }

        }
    }*/

    public static void Recursive(char world[][], int n, int m,int count) {

        if(count>0) {
            for (int i = 0; i < count; i++) {
                System.out.println(count);
                if (n == 0 && m == 0) {//top-left
                    if (world[0][1] == 'H') {//right
                        world[0][1] = 'I';
                        //    Recursive(world, 0, 1);
                    } else if (world[1][0] == 'H') {//bot
                        world[1][0] = 'I';
                        // Recursive(world, 1, 2);
                    }
                } else if (n == 0 && m == 1) {//top
                    if (world[0][1] == 'H') {//right
                        world[0][1] = 'I';
                        //  Recursive(world,1,2);
                    } else if (world[0][0] == 'H')//left
                        world[0][0] = 'I';
                    else if (world[1][1] == 'H')//bottom
                        world[1][1] = 'I';
                } else if (n == 0 && m == 2) {//top-right
                    if (world[0][1] == 'H')//left
                        world[0][1] = 'I';
                    else if (world[1][2] == 'H')//bot
                        world[1][2] = 'I';
                    /* ==================================================================   */
                } else if (n == 1 && m == 0) {//       LEFT
                    if (world[1][1] == 'H')//right
                        world[1][1] = 'I';
                    else if (world[0][0] == 'H')//top
                        world[0][0] = 'I';
                    else if (world[2][0] == 'H')//bottom
                        world[2][0] = 'I';
                } else if (n == 1 && m == 1) {//center
                    //Recursive(world, n, m);
                    if (world[1][2] == 'H') {//right
                        System.out.println("center-right");
                        world[1][2] = 'I';
                        Recursive(world, 1, 2, i);
                    } else if (world[0][1] == 'H') {//top
                        world[0][1] = 'I';
                        //    Recursive(world, 0, 1);
                    } else if (world[1][0] == 'H') {//left
                        world[1][0] = 'I';
                        Recursive(world, 1, 0, i);
                    } else if (world[2][1] == 'H') {//bottom
                        world[2][1] = 'I';
                        //     Recursive(world, 2, 1);
                    }
                } else if (n == 1 && m == 2) {// RIGHT
                    //Recursive(world,n,m);
                    if (world[0][2] == 'H')//top
                        world[0][2] = 'I';
                    else if (world[1][1] == 'H')//left
                        world[1][1] = 'I';
                    else if (world[2][2] == 'H')//bottom
                        world[2][2] = 'I';


                    /*=========================================================================    */

                } else if (n == 2 && m == 0) {//bottom left
                    if (world[2][1] == 'H')//right
                        world[2][1] = 'I';
                    else if (world[1][0] == 'H')//top
                        world[1][0] = 'I';
                } else if (n == 2 && m == 1) {//bottom
                    if (world[2][2] == 'H')//right
                        world[2][2] = 'I';
                    else if (world[1][1] == 'H')//top
                        world[1][1] = 'I';
                    else if (world[2][0] == 'H')//left
                        world[2][0] = 'I';
                } else if (2 == 0 && m == 2) {//bottom-right
                    if (world[1][2] == 'H')//top
                        world[1][2] = 'I';
                    else if (world[2][1] == 'H')//left
                        world[2][1] = 'I';
                }
            }
        }
    }
}

//        https://www.geeksforgeeks.org/find-the-position-of-the-given-row-in-a-2-d-array/




