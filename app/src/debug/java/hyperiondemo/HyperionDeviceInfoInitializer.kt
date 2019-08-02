package hyperiondemo

import com.github.takahirom.hyperion.plugin.simpleitem.SimpleItem
import com.github.takahirom.hyperion.plugin.simpleitem.SimpleItemHyperionPlugin


fun initHyperionDeviceInfo() {
    val manufacturer = android.os.Build.MANUFACTURER
    val deviceModel = "Egis device name"
    val sdk = android.os.Build.VERSION.RELEASE
    val item = SimpleItem.Builder("egis title")
        .text("$manufacturer $deviceModel Android: $sdk")
        .build()
    SimpleItemHyperionPlugin.addItem(item)
}