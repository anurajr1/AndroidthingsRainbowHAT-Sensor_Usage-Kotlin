package com.anu.developers3k.androidthingsrainbowhat_sensor

/**
 * Created by anurajr on 28/12/2017.
 */

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import com.google.android.things.contrib.driver.bmx280.Bmx280
import com.google.android.things.contrib.driver.ht16k33.AlphanumericDisplay
import com.google.android.things.contrib.driver.rainbowhat.RainbowHat
import java.io.IOException

/**
 * Use the sensors in RainbowHAT
 */
class MainActivity : Activity() {

    private var handler: Handler? = null
    private var sensor: Bmx280? = null
    private var display: AlphanumericDisplay? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            sensor = RainbowHat.openSensor()
            display = RainbowHat.openDisplay()
            handler = Handler(mainLooper)

            sensor!!.setMode(Bmx280.MODE_NORMAL)
            sensor!!.setTemperatureOversampling(Bmx280.OVERSAMPLING_1X)
            // sensor.setPressureOversampling(Bmx280.OVERSAMPLING_1X);
            display!!.setEnabled(true)
            runAndSchedule()
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

    private fun runAndSchedule() {
        try {
            //displaying the temperature or pressure value in display
            //display.display(sensor.readPressure());
            display!!.display(sensor!!.readTemperature().toDouble())
        } catch (e: IOException) {
            e.printStackTrace()
        }

        handler!!.postDelayed({ this.runAndSchedule() }, 300)

    }
}
