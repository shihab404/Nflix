package com.shihab

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class NflixPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(NflixMoviesProvider())
        registerMainAPI(NflixSeriesProvider())
    }
}