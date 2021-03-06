package com.droidfeed.util

import android.content.SharedPreferences
import androidx.core.content.edit

/**
 * Total count of share events. The count is used for requesting rate-app dialog flow.
 */
internal var SharedPreferences.shareCount: Int
    set(value) {
        edit { putInt("share_count", value) }
    }
    get() {
        return getInt("share_count", 0)
    }

/**
 * Total count of the application open events.
 */
internal var SharedPreferences.appOpenCount: Int
    set(value) {
        edit { putInt("app_open_count", value) }
    }
    get() {
        return getInt("app_open_count", 0)
    }

/**
 * Count of the app rating criteria matching events.
 */
internal var SharedPreferences.appRatePromptIndex: Int
    set(value) {
        edit { putInt("app_rate_prompt_count", value) }
    }
    get() {
        return getInt("app_rate_prompt_count", APP_RATE_PROMPT_INDEX)
    }

/**
 * Indicates if app rate prompt should be made or not.
 */
internal var SharedPreferences.appRatePrompt: Boolean
    set(value) {
        edit { putBoolean("app_rate_prompt", value) }
    }
    get() {
        return getBoolean("app_rate_prompt", true)
    }