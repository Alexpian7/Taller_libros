package com.example.bibliotecadigitalapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        bookList = new ArrayList<>();
        bookList.add(new Book("Cien años de soledad", "Gabriel García Márquez", R.drawable.cien));
        bookList.add(new Book("El principito", "Antoine de Saint-Exupéry", R.drawable.principito));
        bookList.add(new Book("1984", "George Orwell", R.drawable.jorg));
        bookList.add(new Book("Moby Dick", "Herman Melville", R.drawable.moby));
        bookList.add(new Book("Don Quijote de la Mancha", "Miguel de Cervantes", R.drawable.don));

        bookAdapter = new BookAdapter(bookList, this);
        recyclerView.setAdapter(bookAdapter);
    }
}