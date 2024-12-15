package com.example.pertemuan10roomlocaldb.ui.viewmodel

import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import com.example.pertemuan10roomlocaldb.repository.RepositoryMhs
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filterNot
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.internal.NopCollector.emit
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

class HomeMhsViewModel (
    private val repositoryMhs: RepositoryMhs
) : ViewModel() {
    val homeUIState: StateFlow<HomeUiState> = repositoryMhs.getAllMhs()
        .filterNotNull()
        .map {
            HomeUiState(
                listMhs = it.toList(),
                isLoading = false,
            )
        }
        .onStart {
            emit(HomeUiState(isLoading = true))
            delay(900)
        }
        .catch {
        emit(
            HomeUiState(
                isLoading = false,
                isError = true,
                errorMessage = it.message ?: "Terjadi Kesalahan")
        )
    }

}