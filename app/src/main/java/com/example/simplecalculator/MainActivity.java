package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView result;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi elemen UI
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        btnCalculate = findViewById(R.id.btnCalculate);

        // Event saat tombol ditekan
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPenjumlahan();
            }
        });
    }

    // Fungsi untuk menghitung penjumlahan
    private void hitungPenjumlahan() {
        String angka1 = num1.getText().toString();
        String angka2 = num2.getText().toString();

        int nilai1 = angka1.isEmpty() ? 0 : Integer.parseInt(angka1);
        int nilai2 = angka2.isEmpty() ? 0 : Integer.parseInt(angka2);
        int hasil = nilai1 + nilai2;

        result.setText(String.valueOf(hasil));
    }
    public int addNumbers(int a, int b) {
        return a + b;
    }

}
