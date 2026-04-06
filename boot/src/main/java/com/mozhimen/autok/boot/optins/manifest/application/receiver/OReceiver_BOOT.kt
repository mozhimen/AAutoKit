package com.mozhimen.autok.boot.optins.manifest.application.receiver

import com.mozhimen.kotlin.lintk.annors.AManifestRequire

/**
 * @ClassName OReceiver_BOOT
 * @Description TODO
 * @Author mozhimen
 * @Date 2026/3/30
 * @Version 1.0
 */
@AManifestRequire("""
     * 静态注册(AndroidManifest.xml):
<receiver
android:name=".elemk.receiver.xxxBootReceiver"
android:enabled="true"
android:exported="true">
<intent-filter android:priority="1000">
<action android:name="android.intent.action.BOOT_COMPLETED" />
</intent-filter>
</receiver>
<receiver
""")
@RequiresOptIn("The api is must add this Receiver to your AndroidManifest.xml. 需要声明此Receiver到你的AndroidManifest.xml application下", RequiresOptIn.Level.WARNING)
annotation class OReceiver_BOOT
