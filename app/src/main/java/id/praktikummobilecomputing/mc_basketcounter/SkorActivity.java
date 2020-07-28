package id.praktikummobilecomputing.mc_basketcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SkorActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        String recNameTimA = getIntent().getStringExtra("TIM A");
        String recNameTimB = getIntent().getStringExtra("TIM B");

        TextView tvNameTimA = findViewById(R.id.tv_name_tim_a);
        TextView tvNameTimB = findViewById(R.id.tv_name_tim_b);

        tvNameTimA.setText(recNameTimA);
        tvNameTimB.setText(recNameTimB);
    }

    public void counter(View view) {
        int id =view.getId();
        switch(id){
            case R.id.btn_score_one_tim_a: scoreA = scoreA + 1; break;
            case R.id.btn_score_two_tim_a: scoreA = scoreA + 2; break;
            case R.id.btn_score_three_tim_a: scoreA = scoreA + 3; break;
            case R.id.btn_score_one_tim_b: scoreB = scoreB + 1; break;
            case R.id.btn_score_two_tim_b: scoreB = scoreB + 2; break;
            case R.id.btn_score_three_tim_b: scoreB= scoreB + 3; break;

            case R.id.btn_reset_score_tim_a: scoreA = 0;
            case R.id.btn_reset_score_tim_b: scoreB = 0;
        }


        TextView tvScoreTeamA = findViewById(R.id.tv_score_tim_a);
        TextView tvScoreTeamB = findViewById(R.id.tv_score_tim_b);

        tvScoreTeamA.setText(String.valueOf(scoreA));
        tvScoreTeamB.setText(String.valueOf(scoreB));
    }


}
