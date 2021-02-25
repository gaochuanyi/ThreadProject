package com.example.litepaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addData = findViewById(R.id.add_data);
        Button updateDate = findViewById(R.id.update_data);
        Button queryData = findViewById(R.id.query_data);
        queryData.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                List<Book> books = DataSupport.findAll(Book.class);
                for(Book book:books){
                    Log.d("MainActivity","book name is"+book.getName());
                    Log.d("MainActivity","book author is"+book.getAuthor());
                    Log.d("MainActivity","book pages is"+book.getPress());
                    Log.d("MainActivity","book price is"+book.getPrice());
                    Log.d("MainActivity","book press is"+book.getPress());
                }
            }
        });
        /*updateDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setPrice(999);
                book.setPress("Anchor");
                book.updateAll("name=? and author=?","qqq","ppp");
            }
        });*/
       /* addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setAuthor("ppp");
                book.setName("qqq");
                book.setPages(456);
                book.setPrice(123);
                book.setPress("unknow");
                book.save();

            }
        });*/

    }
}
