package ir.tdroid.bitcoinwidget.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import ir.tdroid.bitcoinwidget.R
import ir.tdroid.bitcoinwidget.remote.ApiService
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

import android.content.ComponentName

import android.appwidget.AppWidgetManager
import android.widget.RemoteViews
import ir.tdroid.bitcoinwidget.ui.widget.BitcoinValueWidget


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var apiService: ApiService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}