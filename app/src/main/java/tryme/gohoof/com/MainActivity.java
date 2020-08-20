package tryme.gohoof.com;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.RED,Color.GREEN,Color.GRAY,Color.MAGENTA,Color.BLACK,Color.YELLOW};

        tryButton = (Button) findViewById(R.id.tryMebutton);
        windowView = findViewById(R.id.WindowViewId);

        tryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorArrayLength = colors.length;
                Random random = new Random();
                int randnum = random.nextInt(colorArrayLength);
                windowView.setBackgroundColor(colors[randnum]);
                Log.d("Random",String.valueOf(randnum));
            }
        });
    }
}