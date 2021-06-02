package unpsjb.ing.tnt.notificationssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.databinding.DataBindingUtil
import unpsjb.ing.tnt.notificationssample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val CHANNEL_ID: String = "CHANNEL-01"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding  = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        createNotificationChannel()
        binding.buttonClickme.setOnClickListener {
            handleButtonClick()
        }
    }

    private fun createNotificationChannel() {
        // Implementar la creación del canal
        return
    }

    private fun handleButtonClick() {
        // construir la notificación y enviarla:
        var builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Titulo de la notificación")
            .setContentText("Contenido del cuerpo de la notificación")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

    }

}