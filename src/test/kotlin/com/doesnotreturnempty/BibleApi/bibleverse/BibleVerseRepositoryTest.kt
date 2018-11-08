package com.doesnotreturnempty.BibleApi.bibleverse

import com.doesnotreturnempty.BibleApi.bibleverse.BibleVerse
import com.doesnotreturnempty.BibleApi.bibleverse.BibleVerseRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@DataJpaTest
class BibleVerseRepositoryTest(@Autowired val bibleVerseRepository: BibleVerseRepository) {

    @Test
    @Throws(Exception::class)
    fun BibleVerseRepository_CanTalkToTheDB_AndRetrieveAVerseById(){
        val result = bibleVerseRepository.findById("GN1_1")
        val expected = BibleVerse("GN1_1", "002_1_1", "GEN", "1", "1", "1", "In the beginning, God created the heavens and the earth. ")
        assertEquals(expected, result.get())
    }

}