package com.company;

import com.company.algorithms.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //LegoBoard Test Cases


        //NULL Check
        try{
            System.out.println("Passing null to LegoBoard");
            new LegoBoard(null);
        }
        catch (IllegalArgumentException ex){
            System.out.println("PASS");
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Empty Board
        try{
            System.out.println("Passing empty board");
            LegoBoard board = new LegoBoard(new ArrayList<>());

            if(board.getBoardVolume() == 0){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Single block Board
        try{
            System.out.println("Passing single block board");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(1);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 0){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Single High Stack Board
        try{
            System.out.println("Single High Stack Board");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(50);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 0){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Double Block Flat Board
        try{
            System.out.println("Double Block Flat Board");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(1);
            blockList.add(1);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 0){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //No-Volume Double Block Board
        try{
            System.out.println("No-Volume Double Block Board");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(1);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 0){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Triple Block Board
        try{
            System.out.println("Triple Block Board");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(1);
            blockList.add(1);
            blockList.add(1);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 0){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Triple Block Board With Volume Of 1
        try{
            System.out.println("Triple Block Board With Volume Of 1");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(1);
            blockList.add(0);
            blockList.add(1);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 1){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Uneven Triple Block Board With Volume Of 1
        try{
            System.out.println("Uneven Triple Block Board With Volume Of 1");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(1);
            blockList.add(0);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 1){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Even Triple Block Board With Volume Of 2
        try{
            System.out.println("Even Triple Block Board With Volume Of 2");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(2);
            blockList.add(0);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 2){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Single Valley Board With Volume Of 4
        try{
            System.out.println("Single Valley Board With Volume Of 4");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(2);
            blockList.add(0);
            blockList.add(0);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 4){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Single Valley Board With Volume Of 3 Left Block
        try{
            System.out.println("Single Valley Board With Volume Of 3 Left Block");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(2);
            blockList.add(1);
            blockList.add(0);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 3){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Single Valley Board With Volume Of 3 Right Block
        try{
            System.out.println("Single Valley Board With Volume Of 3 Right Block");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(2);
            blockList.add(0);
            blockList.add(1);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 3){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Single Valley, Double Range Board With Volume Of 5
        try{
            System.out.println("Single Valley, Double Range Board With Volume Of 5");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(2);
            blockList.add(0);
            blockList.add(1);
            blockList.add(0);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 5){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Double Valley, Double Range Board With Volume Of 4
        try{
            System.out.println("Single Valley, Double Range Board With Volume Of 4");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(2);
            blockList.add(0);
            blockList.add(2);
            blockList.add(0);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 4){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Double Valley, Double Range Board With Volume Of 4 Spike in middle
        try{
            System.out.println("Double Valley, Double Range Board With Volume Of 4 Spike in middle");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(2);
            blockList.add(0);
            blockList.add(5);
            blockList.add(0);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 4){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }

        //Double Valley, Triple Range Board With Volume Of 7
        try{
            System.out.println("Single Valley, Triple Range Board With Volume Of 7");
            ArrayList<Integer> blockList = new ArrayList<>();

            blockList.add(2);
            blockList.add(0);
            blockList.add(1);
            blockList.add(0);
            blockList.add(2);
            blockList.add(0);
            blockList.add(2);

            LegoBoard board = new LegoBoard(blockList);

            if(board.getBoardVolume() == 7){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (Exception ex){
            System.out.println("FAIL");
        }
    }
}
