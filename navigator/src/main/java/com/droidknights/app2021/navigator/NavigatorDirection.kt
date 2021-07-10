package com.droidknights.app2021.navigator

import android.content.Context

interface DetailNavigator {
    /** 세션 상세화면으로 이동 선택 */
    fun openDetail(
        context: Context,
        sessionId: Int
    )
}