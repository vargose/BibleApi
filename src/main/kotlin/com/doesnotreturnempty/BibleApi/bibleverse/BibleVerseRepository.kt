package com.doesnotreturnempty.BibleApi.bibleverse

import org.springframework.data.jpa.repository.JpaRepository

interface BibleVerseRepository : JpaRepository<BibleVerse, String>
