package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

import rs.aleph.android.example12.R;


public class SecondActivity extends Activity {

    private int position = 0;

    private Pizza[] pizzas = new Pizza[] {
            new Pizza("pizza1.png", "MARGHERITA", 3.0f, "fresh mushrooms, green peppers, pepperoni, and mozzarella cheese with onion and red garlic", "hot pizza with chilli flakes", "100g  eq.  266kcal", "9.98 $"),
            new Pizza("pizza2.png", "FEFERONI", 4.0f, "fresh mushrooms, green peppers, pepperoni, and mozzarella cheese with onion and red garlic", "hot pizza with chilli flakes", "100g  eq.  266kcal", "8.90 $"),
            new Pizza("pizza3.png", "CAPRICCIOSA", 5.0f, "fresh mushrooms, green peppers, pepperoni, and mozzarella cheese with onion and red garlic", "hot pizza with chilli flakes", "100g  eq.  266kcal", "7.33 $")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final int position = getIntent().getIntExtra("position", 0);


        ImageView ivImage = (ImageView) findViewById(R.id.pizza_image);
        InputStream is = null;
        try {
            is = getAssets().open(pizzas[position].getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }



        TextView pizzaName = (TextView) findViewById(R.id.pizza_name);
        pizzaName.setText(pizzas[position].getName());


        RatingBar rbRating = (RatingBar) findViewById(R.id.rb_rating);
        rbRating.setRating(pizzas[position].getRating());


        TextView ingridientsDes = (TextView) findViewById(R.id.ingridients_des);
        ingridientsDes.setText(pizzas[position].getIngridients());


        TextView categoryDes = (TextView) findViewById(R.id.category_des);
        categoryDes.setText(pizzas[position].getCategory());


        TextView calorieDes = (TextView) findViewById(R.id.calorie_des);
        calorieDes.setText(pizzas[position].getCalorie());


        TextView price = (TextView) findViewById(R.id.price);
        price.setText(pizzas[position].getPrice());


        Button btnBuy = (Button) findViewById(R.id.button_order);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "You've bought " + pizzas[position].getName() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });




    }
}

