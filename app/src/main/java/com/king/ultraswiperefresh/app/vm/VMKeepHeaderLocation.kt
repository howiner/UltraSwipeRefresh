package com.king.ultraswiperefresh.app.vm

import androidx.lifecycle.ViewModel
import com.king.ultraswiperefresh.UltraSwipeRefreshState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class VMKeepHeaderLocation : ViewModel() {
    private val _state = MutableStateFlow(UltraSwipeRefreshState(false, false))
    val state: StateFlow<UltraSwipeRefreshState> = _state.asStateFlow()

    fun autoRefresh() {
        _state.value.triggerHeaderAnimation()
    }

    fun refresh() {
        _state.value.isRefreshing = true
    }

    fun finishRefresh() {
        _state.value.isRefreshing = false
    }

    fun loadMore() {
        _state.value.isLoading = true
    }

    fun finishLoadMore() {
        _state.value.isLoading = false
    }
}
