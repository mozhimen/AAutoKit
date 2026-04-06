package com.mozhimen.autok.boot.bases

import android.content.Context
import android.content.Intent
import com.mozhimen.autok.boot.optins.manifest.application.receiver.OReceiver_BOOT
import com.mozhimen.kotlin.elemk.android.content.bases.BaseBroadcastReceiver
import com.mozhimen.kotlin.elemk.android.content.cons.CIntent
import com.mozhimen.kotlin.lintk.optins.api.OApiDeprecated_Official_AfterV_26_8_O


/**
 * @ClassName BaseBootReceiver
 * @Description TODO
 * @Author mozhimen
 * @Date 2026/3/30
 * @Version 1.0
 */
@OApiDeprecated_Official_AfterV_26_8_O
@OReceiver_BOOT
open class BaseBootBroadcastReceiver : BaseBroadcastReceiver(){
    override fun onReceive(p0: Context?, p1: Intent?) {
        when (p1?.action) {
            CIntent.ACTION_BOOT_COMPLETED -> {

            }
        }
    }
}