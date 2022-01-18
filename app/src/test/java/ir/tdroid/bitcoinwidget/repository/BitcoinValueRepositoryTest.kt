package ir.tdroid.bitcoinwidget.repository

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import ir.tdroid.bitcoinwidget.data.BitcoinValueLocalDataSource
import ir.tdroid.bitcoinwidget.data.model.BitcoinPriceDto
import ir.tdroid.bitcoinwidget.remote.ApiService
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class BitcoinValueRepositoryTest {

    private lateinit var apiService: ApiService
    private lateinit var bitcoinValueLocalDataSource: BitcoinValueLocalDataSource

    @Before
    fun setup() {
        apiService = mock()
        bitcoinValueLocalDataSource = mock()
    }

    @Test
    fun `save bitcoin price in local data source when old price`() =
        runBlocking {
            whenever(bitcoinValueLocalDataSource.getBitcoinPrice()).thenReturn(
                BitcoinPriceDto(
                    "0.0",
                    0L
                )
            )
            whenever(apiService.exchangeRates()).thenReturn(0.0)
            val bitcoinValueRepositoryTest =
                BitcoinValueRepository(apiService, bitcoinValueLocalDataSource)
            bitcoinValueRepositoryTest.getBitcoinValue()
            verify(bitcoinValueLocalDataSource).setBitcoinPrice(any())
        }


    @Test
    fun `api call when old price`(): Unit =
        runBlocking {
            whenever(bitcoinValueLocalDataSource.getBitcoinPrice()).thenReturn(
                BitcoinPriceDto(
                    "0.0",
                    0L
                )
            )
            whenever(apiService.exchangeRates()).thenReturn(0.0)

            val bitcoinValueRepositoryTest =
                BitcoinValueRepository(apiService, bitcoinValueLocalDataSource)
            bitcoinValueRepositoryTest.getBitcoinValue()
            verify(apiService).exchangeRates()
        }

    @Test
    fun `get bitcoin price from local data source if time is valid`(): Unit =
        runBlocking {
            whenever(bitcoinValueLocalDataSource.getBitcoinPrice()).thenReturn(
                BitcoinPriceDto(
                    "0.0",
                    System.currentTimeMillis()
                )
            )
            whenever(apiService.exchangeRates()).thenReturn(0.0)
            val bitcoinValueRepositoryTest =
                BitcoinValueRepository(apiService, bitcoinValueLocalDataSource)
            bitcoinValueRepositoryTest.getBitcoinValue()
            verify(bitcoinValueLocalDataSource).getBitcoinPrice()
        }

}