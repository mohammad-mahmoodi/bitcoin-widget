package ir.tdroid.bitcoinwidget.ui.widget

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import ir.tdroid.bitcoinwidget.repository.BitcoinValueRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@HiltWorker
class UpdateBitcoinValueWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val bitcoinValueRepository: BitcoinValueRepository,
    private val updateBitcoinValueWidget: UpdateBitcoinValueWidget
) : CoroutineWorker(appContext, workerParams) {
    override suspend fun doWork(): Result {
        return withContext(Dispatchers.IO) {
            try {
                val value = bitcoinValueRepository.getBitcoinValue()
                updateBitcoinValueWidget.updateBitcoinPrice(1/value)
              return@withContext  Result.success()
            } catch (e:Exception){
                return@withContext  Result.retry()
            }
        }
    }
}