package sample;

import javafx.scene.control.TextField;

public class Principle {
    int size;
    int[] board,next_step;
    private int prev,next;

    void rule_30() {
        for(int i=0;i<size;i++) {
            prev=i-1;
            next=i+1;

            if(prev<0)
                prev=size-1;
            if(next==size)
                next=0;

            if(board[prev]==1 && board[i]==1 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==1 && board[i]==1 && board[next]==0)
                next_step[i]=0;
            if(board[prev]==1 && board[i]==0 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==1 && board[i]==0 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==1 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==1 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==0 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==0 && board[next]==0)
                next_step[i]=0;
        }
        System.arraycopy(next_step,0,board,0,size);

    }
    void rule_60() {
        for(int i=0;i<size;i++) {
            prev=i-1;
            next=i+1;

            if(prev<0)
                prev=size-1;
            if(next==size)
                next=0;

            if(board[prev]==1 && board[i]==1 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==1 && board[i]==1 && board[next]==0)
                next_step[i]=0;
            if(board[prev]==1 && board[i]==0 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==1 && board[i]==0 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==1 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==1 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==0 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==0 && board[i]==0 && board[next]==0)
                next_step[i]=0;
        }
        System.arraycopy(next_step,0,board,0,size);

    }
    void rule_90() {
        for(int i=0;i<size;i++) {
            prev=i-1;
            next=i+1;

            if(prev<0)
                prev=size-1;
            if(next==size)
                next=0;

            if(board[prev]==1 && board[i]==1 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==1 && board[i]==1 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==1 && board[i]==0 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==1 && board[i]==0 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==1 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==1 && board[next]==0)
                next_step[i]=0;
            if(board[prev]==0 && board[i]==0 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==0 && board[next]==0)
                next_step[i]=0;
        }
        System.arraycopy(next_step,0,board,0,size);

    }
    void rule_120() {
        for(int i=0;i<size;i++) {
            prev=i-1;
            next=i+1;

            if(prev<0)
                prev=size-1;
            if(next==size)
                next=0;

            if(board[prev]==1 && board[i]==1 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==1 && board[i]==1 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==1 && board[i]==0 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==1 && board[i]==0 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==1 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==0 && board[i]==1 && board[next]==0)
                next_step[i]=0;
            if(board[prev]==0 && board[i]==0 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==0 && board[i]==0 && board[next]==0)
                next_step[i]=0;
        }
        System.arraycopy(next_step,0,board,0,size);

    }
    void rule_225() {
        for(int i=0;i<size;i++) {
            prev=i-1;
            next=i+1;

            if(prev<0)
                prev=size-1;
            if(next==size)
                next=0;

            if(board[prev]==1 && board[i]==1 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==1 && board[i]==1 && board[next]==0)
                next_step[i]=1;
            if(board[prev]==1 && board[i]==0 && board[next]==1)
                next_step[i]=1;
            if(board[prev]==1 && board[i]==0 && board[next]==0)
                next_step[i]=0;
            if(board[prev]==0 && board[i]==1 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==0 && board[i]==1 && board[next]==0)
                next_step[i]=0;
            if(board[prev]==0 && board[i]==0 && board[next]==1)
                next_step[i]=0;
            if(board[prev]==0 && board[i]==0 && board[next]==0)
                next_step[i]=1;
        }
        System.arraycopy(next_step,0,board,0,size);

    }

}
