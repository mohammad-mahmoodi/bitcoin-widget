package ir.tdroid.bitcoinwidget

import android.app.Application
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import dagger.hilt.android.HiltAndroidApp
import ir.tdroid.bitcoinwidget.ui.widget.UpdateBitcoinValueWorker
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@HiltAndroidApp
class App : Application() , Configuration.Provider {
    @Inject
    lateinit var workerFactory: HiltWorkerFactory

    override fun onCreate() {
        super.onCreate()
        WorkManager.getInstance(this)
            .enqueueUniqueWork("pending_update_widget",
                ExistingWorkPolicy.KEEP,
                OneTimeWorkRequestBuilder<UpdateBitcoinValueWorker>()
                    .setInitialDelay(3650,TimeUnit.DAYS)
                    .build()
            )


    }

    override fun getWorkManagerConfiguration(): Configuration {
        return Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()
    }
}