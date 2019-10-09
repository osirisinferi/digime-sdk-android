/*
 * Copyright (c) 2009-2019 digi.me Limited. All rights reserved.
 */

package me.digi.sdk.models.medical.mob2.secondary

import me.digi.sdk.models.ModelTest
import me.digi.sdk.models.objects.medical.mob2.secondary.TContact

class ContactSpec : ModelTest<Contact>(Contact::class.java) {
    override val emptyTest: Contact? = Contact(
            null,
            null,
            null,
            null,
            null,
            null,
            null
    )

    override val jsonObjectTests: List<Pair<Contact?, String>> =
            listOf(
                    Pair(
                            TContact.obj,
                            TContact.json
                    )
            )
}