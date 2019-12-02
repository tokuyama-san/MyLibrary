package toku.san.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import toku.san.mylibrarysdk.MyLibrary

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lib = MyLibrary()
        lib.logging("AAAAAAAAAAAAAAAA")
    }
}
