package ir.tdroid.bitcoinwidget.repository

import ir.tdroid.bitcoinwidget.data.BitcoinValueLocalDataSource
import ir.tdroid.bitcoinwidget.remote.ApiService
import javax.inject.Inject
const val validBitcoinPriceDuration = 1000 * 60 * 60 * 24L
class BitcoinValueRepository @Inject constructor(
    private val apiService: ApiService,
    private val bitcoinValueLocalDataSource: BitcoinValueLocalDataSource,
) {

    suspend fun getBitcoinValue(): Double {
        val bitcoinPrice = bitcoinValueLocalDataSource.getBitcoinPrice()
        if (bitcoinPrice.time!! > (System.currentTimeMillis() - validBitcoinPriceDuration)) {
            return bitcoinPrice.price?.toDouble() ?: 0.0
        }
        val value = apiService.exchangeRates()
        bitcoinValueLocalDataSource.setBitcoinPrice(value)
        return value
    }

}