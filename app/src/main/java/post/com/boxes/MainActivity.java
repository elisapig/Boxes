package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edLength;
    private EditText edWidth;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        edLength = findViewById(R.id.ed_length);
        edWidth = findViewById((R.id.ed_width));
        edHeight = findViewById((R.id.ed_height));
    }
    public void check(View view){
    float lenght = Float.parseFloat(edLength.getText().toString());
    float widtht = Float.parseFloat(edWidth.getText().toString());
    float height = Float.parseFloat(edHeight.getText().toString());
     if(lenght<=23&&widtht<=14&&height<=13) {
         Intent intent = new Intent(this, Box3.class);
         intent.putExtra("lenght", lenght);
         intent.putExtra("widtht", widtht);
         intent.putExtra("widtht", widtht);
         startActivity(intent);
     }else{
         Intent intent = new Intent(this, Box5.class);
         intent.putExtra("lenght", lenght);
         intent.putExtra("widtht", widtht);
         intent.putExtra("widtht", widtht);
         startActivity(intent);

     }
}
}
