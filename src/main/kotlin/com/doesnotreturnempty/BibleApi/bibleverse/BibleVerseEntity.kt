package com.doesnotreturnempty.BibleApiKyrios.bibleverse

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id


@Entity(name = "engwebp_vpl")
data class BibleVerseEntity(

        @Id
        @Column(name = "verseID")
        val id: String,

        @Column(nullable = false)
        val canonOrder: String,

        @Column(nullable = false)
        val book: String,

        @Column(nullable = false)
        val chapter: String,

        @Column(name="STARTVERSE", nullable = false)
        val startVerse: String,

        @Column(name="ENDVERSE", nullable = false)
        val endVerse: String,

        @Column(name="VERSETEXT", nullable = false, length=5120)
        val verseText: String
)