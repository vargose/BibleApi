package com.doesnotreturnempty.BibleApiKyrios.bibleverse

import org.springframework.data.jpa.repository.JpaRepository

interface BibleVerseRepository : JpaRepository<BibleVerseEntity, String>
