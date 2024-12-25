package ${PACKAGE_NAME}

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ${NAME}ViewModel @Inject constructor(): BaseViewModel<${NAME}Event, ${NAME}State, ${NAME}Effect>() {
    override fun setInitialState(): ${NAME}State {
        return ${NAME}State()
    }

    override fun handleEvents(event: ${NAME}Event) {
        when (event) {
            ${NAME}Event.OnBackClicked -> {
                setEffect { ${NAME}Effect.NavigateBack }
            }
        }
    }
}

sealed interface ${NAME}Event: Event {
    data object OnBackClicked: ${NAME}Event
}

data class ${NAME}State(
    val isLoading: Boolean = false
): State

sealed interface ${NAME}Effect: Effect {
    data object NavigateBack: ${NAME}Effect
}