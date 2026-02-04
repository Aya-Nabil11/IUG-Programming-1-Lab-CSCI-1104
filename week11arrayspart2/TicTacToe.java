/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11arrayspart2;

import java.util.Scanner;

/**
 *
 * @author aya
 */
public class TicTacToe {
    public static void main(String[] args) {
       boolean winner = false;
       boolean turn = false;
        String [] [] board = {
            {""  ,  ""  ,   ""},
            {""  ,  ""  ,   ""},
            {""  ,  ""  ,   ""}
        };
        int loop_variable =0;
        String player=null;
do{
        player = turn?"O":"X";
        for(int i = 0 ;i<board.length;i++){
            for(int j = 0 ;j<board[i].length;j++){
                System.out.print("[" +board[i][j]+"]");
            }
            System.out.println("");
        }
        Scanner s = new Scanner(System.in);
        System.out.println("====> "+player+" Trun");
        System.out.println("Choose row");
        int row = s.nextInt();
        System.out.println("Choose column");
        int column = s.nextInt();
        if(row<=3 && row>=1&&column>=1&&column<=3 &&board[row-1][column-1].equals("")){
            board[row-1][column-1] = player;
            loop_variable+=1;
        }else{
            System.out.println("Try again");
            turn=!turn;
        }
        String line = "";
        for(int i =0;i<8;i++){
            switch (i){
                case 0 :
                    line = board[0][0]+board[0][1]+board[0][2];
                    break;
                case 1 :
                    line = board[1][0]+board[1][1]+board[1][2];
                    break;
                case 2 :
                    line = board[2][0]+board[2][1]+board[2][2];
                    break;
                case 3 :
                    line = board[0][0]+board[1][0]+board[2][0];
                    break;
                case 4 :
                    line = board[0][1]+board[1][1]+board[2][1];
                    break;
                case 5 :
                    line = board[0][2]+board[1][2]+board[2][2];
                    break;
                case 6 :
                    line = board[0][0]+board[1][1]+board[2][2];
                    break;
                case 7 :
                    line = board[0][2]+board[1][1]+board[2][0];
                    break;
            }  
                if(line.equals("XXX") || line.equals("OOO")){
                    winner =true;
                }
            }
        if(winner) {
            break;
        }
        
        
        turn = !turn;
}while(loop_variable<=8);
      for(int i = 0 ;i<board.length;i++){
            for(int j = 0 ;j<board[i].length;j++){
                System.out.print("[" +board[i][j]+"]");
            }
            System.out.println("");
        }  
        
        if(winner){
            System.out.println("Congratulation "+player+" Win");
        }else{
            System.out.println("No one is win");
        }

    }
}
