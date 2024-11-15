import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showInicio by remember { mutableStateOf(true) }
        if (showInicio) {
            Inicio(changeShowInicio = {showInicio = false})
        } else {
            SegundaPantalla()
        }
    }
}

@Composable
fun Inicio(changeShowInicio: () -> Unit){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Esta es la pantalla de inicio")
        Button(
            onClick = changeShowInicio
        ){
            Text(text = "Continuar")
        }
    }

}

@Composable
fun SegundaPantalla(){

}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
