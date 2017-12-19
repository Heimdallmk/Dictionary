package com.easylabs.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity
        extends AppCompatActivity implements View.OnClickListener {
    // Объявляем объекты
    Button btTask1;
    Button btTask2;
    Button btTask3;
    Button btTask4;

    // Вызывается при запуске Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Изменяет заголовок окна
        setTitle("Выберите тему");

        // findViewById - возвращает элемент типа View
        // Этот тип явл. основным для всех GUI-элементов
        // Инициализируем кнопки
        btTask1 = (Button) findViewById(R.id.btTask1);
        btTask2 = (Button) findViewById(R.id.btTask2);
        btTask3 = (Button) findViewById(R.id.btTask3);
        btTask4 = (Button) findViewById(R.id.btTask4);

        // Добавляем обработчик на нажатие кнопки
        btTask1.setOnClickListener(this);
        btTask2.setOnClickListener(this);
        btTask3.setOnClickListener(this);
        btTask4.setOnClickListener(this);
    }

    // Метод, который будет вызываться тогда, когда произошла нажатие на кнопку
    @Override
    public void onClick(View view) {
        // Получаем id элемента, на который нажали
        int viewId = view.getId();

        // Определяем, какая кнопка была нажата
        switch (viewId) {
            case R.id.btTask1:
                Data.num = 1;
                break;
            case R.id.btTask2:
                Data.num = 2;
                break;
            case R.id.btTask3:
                Data.num = 3;
                break;
            case R.id.btTask4:
                Data.num = 4;
                break;
        }

        Toast.makeText(this, "Нажата кнопка " + Data.num, Toast.LENGTH_SHORT).show();
        System.out.println("Нажата кнопка " + Data.num);

        // Создаём намерение на запуск другого Activity
        Intent intent = new Intent(this, DictionaryActivity.class);

        // Запускаем другое Activity
        startActivity(intent);
    }
}
