package com.example.simplecalculator;

import android.content.Context;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    /*
     * Test Case 1: Memastikan aplikasi memiliki konteks yang benar.
     * Expected Output: Nama package harus sesuai dengan yang didefinisikan di AndroidManifest.xml
     */
    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.simplecalculator", appContext.getPackageName());
    }

    /*
     * Test Case 2: Menguji apakah operasi penjumlahan di UI berfungsi dengan benar.
     * Langkah pengujian:
     * 1. Ketik angka "7" di input pertama.
     * 2. Ketik angka "3" di input kedua.
     * 3. Tekan tombol "Calculate".
     * Expected Output: Hasil yang ditampilkan di UI harus "10".
     */
    @Test
    public void testAdditionInUI() {
        onView(withId(R.id.num1)).perform(typeText("7"));  // Memasukkan angka pertama (7)
        onView(withId(R.id.num2)).perform(typeText("3"));  // Memasukkan angka kedua (3)
        onView(withId(R.id.btnCalculate)).perform(click()); // Menekan tombol "Calculate"
        onView(withId(R.id.result)).check(matches(withText("10"))); // Memeriksa apakah hasilnya benar
    }
}
