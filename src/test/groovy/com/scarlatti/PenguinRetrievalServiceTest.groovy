package com.scarlatti

import com.scarlatti.model.Penguin
import org.junit.Test
import spock.lang.Shared
import spock.lang.Specification

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Tuesday, 2/27/2018
 */
class PenguinRetrievalServiceTest extends Specification {

    @Shared
    PenguinRetrievalService penguinRetrievalService

    def setupSpec() {
        penguinRetrievalService = new PenguinRetrievalService()
    }


    @Test
    "retrieve penguins"() {
        when:
            List<Penguin> penguins = penguinRetrievalService.getPenguins()
        then:
            penguins != null
            penguins.size() > 0
    }
}
