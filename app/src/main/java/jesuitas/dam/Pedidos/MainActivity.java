package jesuitas.dam.Pedidos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import jesuitas.dam.Pedidos.R;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {

        if (quantity > 0) quantity--;
        display(quantity);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {

        if (quantity < 25) quantity++;
        display(quantity);
    }

    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.textView_count);
        quantityTextView.setText(String.valueOf(number));
    }

}