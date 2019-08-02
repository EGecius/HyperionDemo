package hyperiondemo

import com.github.takahirom.hyperion.plugin.simpleitem.SimpleItem
import com.github.takahirom.hyperion.plugin.simpleitem.SimpleItemHyperionPlugin


fun initHyperionDeviceInfo() {
    val manufacturer = android.os.Build.MANUFACTURER
    val deviceModel = android.os.Build.MODEL
    val sdk = android.os.Build.VERSION.RELEASE
    val item = SimpleItem.Builder("Device info")
        .text(
            "$manufacturer $deviceModel" +
                    "\nAndroid: $sdk"
        )
        .build()
    SimpleItemHyperionPlugin.addItem(item)
}