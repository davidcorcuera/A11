package jesuitas.dam.Pedidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);

        Intent intent = getIntent();
        String text = intent.getStringExtra("texto");

        TextView texto =findViewById(R.id.textView_order_summary);
        texto.setText(text);
    }
}