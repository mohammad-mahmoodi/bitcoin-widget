package ir.tdroid.bitcoinwidget.remote

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import ir.tdroid.bitcoinwidget.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

@Module
@InstallIn(ActivityRetainedComponent::class)
object RemoteModule {

    @Provides
    @ActivityRetainedScoped
    fun provideApiService(gson: Gson,okHttpClient: OkHttpClient): ApiService {
        return Retrofit.Builder()
            .baseUrl("https://blockchain.info/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addConverterFactory(ScalarsConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @ActivityRetainedScoped
    fun provideJson(): Gson {
        return Gson()
    }

    @Provides
    @ActivityRetainedScoped
    fun provideOkHttp(): OkHttpClient {

        val okBuilder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.apply { interceptor.level = HttpLoggingInterceptor.Level.BODY }
            okBuilder.addInterceptor(interceptor)
        }

        return okBuilder.build()

    }
}
