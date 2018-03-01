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
class TrainStationTest extends Specification {

    @Shared
    TrainStation trainStation

    def setupSpec() {
        trainStation = new TrainStation()
    }

    @Test
    "train station will transport passenger"() {
        trainStation.transport(new Penguin("Phil", 6))
    }

    @Test
    "train station allows travelers 3 and older for age #age"(int age) {
        when:
            Penguin penguin = new Penguin("Alguien", age)
        then:
            trainStation.allowsTraveler(penguin)
        where:
            age << [3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25, 30]
    }

    @Test
    "train station does not allows travelers below 3 for age #age"(int age) {
        when:
            Penguin penguin = new Penguin("Alguien", age)
        then:
            !trainStation.allowsTraveler(penguin)
        where:
            age << [0, 1, 2]
    }
}
