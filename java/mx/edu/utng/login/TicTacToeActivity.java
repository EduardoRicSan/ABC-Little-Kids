package mx.edu.utng.login;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TicTacToeActivity extends AppCompatActivity {
    private int activePlayer = 0; //0 for ladybug player
    private int[] gameState = {2,2,2,2,2,2,2,2,2}; //2 means unplayed
    private int[][] winningLocations = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6},
            {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
    private boolean gameOver = false;

    public void gameLogic(View v) {
        ImageView tappedView = (ImageView) v;
        int tappedLocation = Integer.parseInt(v.getTag().toString());

        if (gameState[tappedLocation]==2 && !gameOver ) {
            gameState[tappedLocation] = activePlayer;

            tappedView.setTranslationY(-15f);
            if (activePlayer == 0) {
                tappedView.setImageResource(R.drawable.ladybug);
                activePlayer = 1;
            } else if (activePlayer == 1) {
                tappedView.setImageResource(R.drawable.bee);
                activePlayer = 0;
            }


        }
        tappedView.animate().translationYBy(-10f).setDuration(30);


        String msg="";

        for (int pos :gameState){
            if(pos!=2){
                gameOver = true;
            }else{
                gameOver = false;
            }
        }

        for (int[] winningPosition : winningLocations){

            if (gameState[winningPosition[0]] == gameState[winningPosition[1]]
                    && gameState[winningPosition[1]] == gameState[winningPosition[2]]
                    && gameState[winningPosition[0]] != 2){
                if (activePlayer == 0)
                    msg = "Bee is the winner";

                    // Toast.makeText(getApplicationContext(), "Bee is the winner", Toast.LENGTH_SHORT).show();

                    if (activePlayer == 1)
                        msg = "Ladybug is the winner";
                    //   Toast.makeText(getApplicationContext(), "LadyBug is the winner", Toast.LENGTH_SHORT).show();

                        LinearLayout winnerLayout = (LinearLayout) findViewById(R.id.winner_layout);
                        winnerLayout.setVisibility(View.VISIBLE);

                    TextView winningMsg = (TextView)findViewById(R.id.tvMsg);
                winningMsg.setText(msg);

                        gameOver = true;
            }


        }


    if(gameOver==true&&msg.equals("")){
        msg = "Empate";
        LinearLayout winnerLayout = (LinearLayout) findViewById(R.id.winner_layout);
        winnerLayout.setVisibility(View.VISIBLE);

        TextView winningMsg = (TextView)findViewById(R.id.tvMsg);
        winningMsg.setText(msg);

        gameOver = true;
    }
    }

    public void playAgain(View view){
      LinearLayout winnerLayout = (LinearLayout)findViewById(R.id.winner_layout);
        winnerLayout.setVisibility(View.INVISIBLE);
        gameOver = false;
        activePlayer = 0;
        for (int i =0; i < gameState.length; i++) {
            gameState[i] = 2;
        }
            GridLayout glGame = (GridLayout)findViewById(R.id.gl_game);
            for (int e =0; e< glGame.getChildCount(); e++){
                ((ImageView)glGame.getChildAt(e)).setImageResource(0);



        }

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        //Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        //getSupportActionBar(toolbar);

        LinearLayout winnerLayout = (LinearLayout)findViewById(R.id.winner_layout);
        winnerLayout.setVisibility(View.INVISIBLE);
    }

   // private void getSupportActionBar(Toolbar toolbar) {
    //}


}
