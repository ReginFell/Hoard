package com.github.popalay.store.fetchpolicy

class SingleFetchPolicy<in RAW> : FetchPolicy<RAW> {

    @Volatile private var refreshed = false

    override fun onFetched(data: RAW) {
        refreshed = true
    }

    override fun shouldFetch(data: RAW) = !refreshed
}