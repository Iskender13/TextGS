package com.example.textgs;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Создайте экземпляры фрагментов
        CounterFragment firstFragment = new CounterFragment();
        Fragment2 secondFragment = new Fragment2();

        // Добавьте первый фрагмент в контейнер
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, firstFragment)
                .commit();

        // Настройте код или события, которые будут выполнять переход между фрагментами
        // Например, при щелчке на кнопке
        findViewById(R.id.btn_open_next_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Замените первый фрагмент вторым фрагментом
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container2, secondFragment)
                        .addToBackStack(null) // Добавьте в стек возврата
                        .commit();
            }
        });
    }
}