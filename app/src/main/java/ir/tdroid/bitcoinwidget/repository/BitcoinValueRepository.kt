package ir.tdroid.bitcoinwidget.repository

import ir.tdroid.bitcoinwidget.remote.ApiService
import javax.inject.Inject

class BitcoinValueRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getBitcoinValue() : Double {
        return apiService.exchangeRates()
    }

}