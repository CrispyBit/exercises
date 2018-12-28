package com.company.algorithms;

public class FillImage {

    //Sample Data
    public static int[][] testData3x3 = new int[][] {
            {1,1,1},
            {1,0,1},
            {1,1,1}};

    public static int[][] testData4x4 = new int[][] {
            {0,1,1,0},
            {1,0,0,1},
            {1,0,0,1},
            {0,1,1,0}};

    public static int[][] testData2 = new int[][] {
            {0,1,1,0},
            {1,0,0,1},
            {1,0,0,1},
            {0,1,1,0}};

    public static int[][] testData5 = new int[][] {
            {1,1,1,1,1},
            {1,0,0,0,1},
            {1,0,1,0,1},
            {1,0,1,0,1},
            {1,0,0,0,1},
            {1,1,1,1,1}};

    //Diagnostic for counting the number of passes (Not thread safe as implemented)
    private int passCounter = 0;

    /**
     * Fills the coordinates (x,y) and their matching adjacent values with the provided new value.
     * @param image The image data to update.
     * @param x The X component of the coordinate to update.
     * @param y The Y component of the coordinate to update.
     * @param newValue The new value to update the coordinate and its matching adjacent values to.
     */
    public void fill(int[][] image, int x, int y, int newValue){
        //DIAGNOSTIC Reset pass counter and print out the original image
        passCounter = 0;
        System.out.println("Original Image:");
        printImage(image);
        System.out.println("\n");

        //Sanity check on the image
        if(image == null || image.length == 0){
            return;
        }

        //Sanity check on the initial coordinate values. If out of bounds, return
        if(x < 0 || y < 0 || y >= image.length || x >= image[y].length){
            return;
        }

        //Get the target value
        int targetValue = image[y][x];

        //If target value matches newValue, then no need to do anything
        if(targetValue != newValue) {
            _fill(image, x, y, targetValue, newValue);
        }

        //DIAGNOSTIC - Print out total passes at the end
        System.out.println(String.format("Total Passes: %d", passCounter));
    }

    /**
     * Fills the coordinates (x,y) and their matching adjacent values with the provided new value.
     * @param image The image data to update.
     * @param x The X component of the coordinate to update.
     * @param y The Y component of the coordinate to update.
     * @param targetValue The value that, if matched, will be updated to the new value.
     * @param newValue The new value to update the coordinate and its matching adjacent values to.
     */
    private void _fill(int[][] image, int x, int y, int targetValue, int newValue){

        //If coordinate components are outside the bounds of the arrays, return
        if(x < 0 || y < 0 || y >= image.length || x >= image[y].length){
            return;
        }

        //If value at coordinate does not match the target value, return
        if(image[y][x] != targetValue){
            return;
        }

        //Update coordinate with new value
        image[y][x] = newValue;

        //DIAGNOSTIC - Prints out the current pass count and the current state of the image
        System.out.println(String.format("Pass %d\nCurrent Image State:\n", ++passCounter));
        printImage(image);

        //Go Right
        _fill(image, x + 1, y, targetValue, newValue);

        //Go Left
        _fill(image, x - 1, y, targetValue, newValue);

        //Go Down
        _fill(image, x, y + 1, targetValue, newValue);

        //Go Up
        _fill(image, x, y - 1, targetValue, newValue);

        //OPTIONAL IMPLEMENTATION - Consider also updating the 'diagonal corners' of the current cell as well
//        _fill(image, x + 1, y - 1, targetValue, newValue);
//        _fill(image, x + 1, y + 1, targetValue, newValue);
//        _fill(image, x - 1, y - 1, targetValue, newValue);
//        _fill(image, x - 1, y + 1, targetValue, newValue);
        return;
    }

    /**
     * Prints out the provided image to the console.
     * @param image The image to print out to the console.
     */
    private static void printImage(int[][] image){
        for(int x = 0; x < image.length; x++){
            for(int y = 0; y < image[x].length; y++){
                System.out.print(image[x][y] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }
}
