package com.example.android.bookdatabase;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class BookHolder extends RecyclerView.ViewHolder {

    private final TextView year, title, price, author;

    public BookHolder(View itemView) {
        super(itemView);
        year = itemView.findViewById(R.id.yearTextView);
        title = itemView.findViewById(R.id.titleTextView);
        price = itemView.findViewById(R.id.priceTextView);
        author = itemView.findViewById(R.id.authorTextView);
    }

    public void setYear(String y) {
        year.setText(y);
    }

    public void setTitle(String t) {
        title.setText(t);
    }

    public void setPrice(String p) {
        price.setText(p);
    }

    public void setAuthor(String a) {
        author.setText(a);
    }
}
