package ir.tdroid.bitcoinwidget.ui.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.util.Log
import android.widget.RemoteViews
import androidx.work.*
import dagger.hilt.android.AndroidEntryPoint
import ir.tdroid.bitcoinwidget.R
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@AndroidEntryPoint
class BitcoinValueWidget : AppWidgetProvider() {
    private val constraints = Constraints.Builder()
        .setRequiredNetworkType(NetworkType.CONNECTED)
        .build()

    private val updateBitcoinValueWorkerRequest: WorkRequest =
        OneTimeWorkRequestBuilder<UpdateBitcoinValueWorker>()
            .setConstraints(constraints)
            .setBackoffCriteria(
                BackoffPolicy.LINEAR,
                10,
                TimeUnit.MILLISECONDS
            )
            .build()

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        WorkManager
            .getInstance(context)
            .enqueue(updateBitcoinValueWorkerRequest)

    }

    override fun onEnabled(context: Context) {

    }

    override fun onDisabled(context: Context) {

    }
}
