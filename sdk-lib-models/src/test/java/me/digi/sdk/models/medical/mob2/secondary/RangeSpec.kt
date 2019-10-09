/*
 * Copyright (c) 2009-2019 digi.me Limited. All rights reserved.
 */

package me.digi.sdk.models.medical.mob2.secondary

import me.digi.sdk.models.ModelTest
import me.digi.sdk.models.objects.medical.mob2.secondary.TRange

class RangeSpec : ModelTest<Range>(Range::class.java) {
    override val emptyTest: Range? = Range(
            null,
            null
    )

    override val jsonObjectTests: List<Pair<Range?, String>> =
            listOf(
                    Pair(
                            TRange.obj,
                            TRange.json
                    )
            )
}