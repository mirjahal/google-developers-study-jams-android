package com.almir.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int quantity = 3;
    private static final int COFFEE_PRICE = 5;
    private TextView quantityTextView;
    private TextView priceTextView;
    private TextView totalTextView;
    private TextView thanksTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayNumberOfCoffees(quantity);
        displayPrice(COFFEE_PRICE);
    }

    public void submitOrder(View view) {
        displayTotal(quantity * COFFEE_PRICE);
        displayThanks();
    }

    public void increment(View view) {
        quantity++;
        displayNumberOfCoffees(quantity);
    }

    public void decrement(View view) {
        quantity--;
        quantity = Math.max(1, quantity);
        displayNumberOfCoffees(quantity);
    }

    private void displayNumberOfCoffees(int numberOfCoffees) {
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    private void displayPrice(int price) {
        priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(price));
    }

    private void displayTotal(int total) {
        totalTextView = (TextView) findViewById(R.id.total_text_view);
        totalTextView.setText("Total: " + NumberFormat.getCurrencyInstance().format(total));
    }

    private void displayThanks() {
        thanksTextView = (TextView) findViewById(R.id.thanks_text_view);
        thanksTextView.setVisibility(View.VISIBLE);
    }

}
