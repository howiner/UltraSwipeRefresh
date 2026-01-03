package com.king.ultraswiperefresh.app.vm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class VMKeepHeaderLocation1 : ViewModel() {
    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _indicatorOffset = MutableStateFlow(0f)
    var indicatorOffset: StateFlow<Float> = _indicatorOffset.asStateFlow()
    fun updateIndicatorOffset(offset: Float) {
        _indicatorOffset.value = offset
    }

    fun refresh() {
        _isRefreshing.value = true
    }

    fun finishRefresh() {
        _isRefreshing.value = false
    }

    fun loadMore() {
        _isLoading.value = true
    }

    fun finishLoadMore() {
        _isLoading.value = false
    }
}
