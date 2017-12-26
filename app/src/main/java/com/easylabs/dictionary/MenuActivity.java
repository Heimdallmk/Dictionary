package com.easylabs.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MenuActivity
        extends AppCompatActivity implements View.OnClickListener {
    // Объявляем объекты
    RelativeLayout btTask1;
    RelativeLayout btTask2;
    RelativeLayout btTask3;
    RelativeLayout btTask4;

    // Вызывается при запуске Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Изменяет заголовок окна
        // Получаем строку из файлов ресурсов нашего приложения
        setTitle(getString(R.string.menu_activity_title));

        // findViewById - возвращает элемент типа View
        // Этот тип явл. основным для всех GUI-элементов
        // Инициализируем кнопки
        btTask1 = (RelativeLayout) findViewById(R.id.btTask1);
        btTask2 = (RelativeLayout) findViewById(R.id.btTask2);
        btTask3 = (RelativeLayout) findViewById(R.id.btTask3);
        btTask4 = (RelativeLayout) findViewById(R.id.btTask4);

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
                Data.num = 0;
                break;
            case R.id.btTask2:
                Data.num = 1;
                break;
            case R.id.btTask3:
                Data.num = 2;
                break;
            case R.id.btTask4:
                Data.num = 3;
                break;
        }

        // Создаём намерение на запуск другого Activity
        Intent intent = new Intent(this, DictionaryActivity.class);

        // Запускаем другое Activity
        startActivity(intent);
    }
}
