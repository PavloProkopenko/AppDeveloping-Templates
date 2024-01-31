package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.lifecycleScope
import com.example.littlelemon.ui.theme.LittleLemonTheme
import io.ktor.client.*
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.request.get
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private val responseLiveData = MutableLiveData<String>()

    private val httpClient = HttpClient(Android)

    private suspend fun fetchContent() : String {
        return httpClient
            .get("https://raw.githubusercontent.com/Meta-Mobile-Developer-PC/Working-With-Data-API/main/littleLemonMenu.json")
            .body()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val responseState = responseLiveData.observeAsState("").value
                    Column {
                        Text(text = responseState.toString())
                        Button(
                            onClick = {
                                lifecycleScope.launch {
                                    val response = fetchContent()

                                    runOnUiThread{responseLiveData.value = response}
                                }
                            }
                        ) {
                            Text(text = "Download")
                        }
                    }
                }
            }
        }
    }
}
