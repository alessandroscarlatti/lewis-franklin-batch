package com.scarlatti

import org.junit.Test
import spock.lang.Specification

import java.nio.file.Files
import java.nio.file.Paths

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 3/2/2018
 */
class CommonTest extends Specification {

    @Test
    "can access common utility class"() {
        expect:
            println "accessed common utility class in system test: ${CommonUtil.getAPenguinName()}"
    }

    @Test
    "can access common resource"() {
        expect:
            println new String(Files.readAllBytes(Paths.get(this.class.getResource("/common-joke.txt").toURI())))
    }

    @Test
    "can access module resource"() {
        expect:
            println new String(Files.readAllBytes(Paths.get(this.class.getResource("/joke.txt").toURI())))
    }
}
