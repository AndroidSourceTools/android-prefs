/*
 * This source is part of the
 *      _____  ___   ____
 *  __ / / _ \/ _ | / __/___  _______ _
 * / // / , _/ __ |/ _/_/ _ \/ __/ _ `/
 * \___/_/|_/_/ |_/_/ (_)___/_/  \_, /
 *                              /___/
 * repository.
 *
 * Copyright (C) 2015-present Benoit 'BoD' Lubek (BoD@JRAF.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jraf.android.prefs.sample.prefs

import android.content.Context
import org.jraf.android.prefs.DefaultInt
import org.jraf.android.prefs.DefaultStringSet
import org.jraf.android.prefs.Prefs

/**
 * Other settings useful for the app.
 */
@Prefs(
    fileName = "settings",
    fileMode = Context.MODE_PRIVATE,
    useAndroidX = true
)
class Settings {
    @DefaultInt(-0x44ff23)
    var preferredColor: Int? = null

    /**
     * The week days that the user prefers.
     */
    @DefaultStringSet("Friday", "Saturday")
    var weekDays: Set<String>? = null
}
