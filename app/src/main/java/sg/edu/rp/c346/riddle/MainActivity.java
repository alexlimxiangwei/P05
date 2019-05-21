package sg.edu.rp.c346.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    Button btnRevealQ1;
    Button btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.tvQ1) ;
        btnRevealQ1 = findViewById(R.id.btnReveal1);
        btnRevealQ2 = findViewById(R.id.btnReveal2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getBaseContext(), AnswerActivity3.class);
                intent.putExtra("Question", "Q1 answer is: Queue");
                startActivity(intent);
            }

        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getBaseContext(), AnswerActivity3.class);
                intent.putExtra("Question", "Q2 answer is: Gone");
                startActivity(intent);
            }

        });



    }
}
