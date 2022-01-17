package ir.tdroid.bitcoinwidget.ui.widget

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.view.View
import android.widget.RemoteViews
import dagger.hilt.android.qualifiers.ApplicationContext
import ir.tdroid.bitcoinwidget.R
import javax.inject.Inject

class UpdateBitcoinValueWidget @Inject constructor(
    @ApplicationContext private val context: Context,
    ) {
    fun updateBitcoinPrice(bitcoinPrice : Double) {
        val appWidgetManager = AppWidgetManager.getInstance(context)
        val price = String.format("%.2f", bitcoinPrice ) + " $"
        val views = RemoteViews(context.packageName, R.layout.bitcoin_value_widget)
        views.setTextViewText(R.id.bitcoinPrice, price)
        views.setViewVisibility(R.id.progressBar , View.GONE)
        appWidgetManager.updateAppWidget(
            ComponentName(
                context.packageName,
                BitcoinValueWidget::class.java.name
            ), views
        )
    }



}