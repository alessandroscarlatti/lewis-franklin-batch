package com.scarlatti.springBootUtility

import org.junit.Test
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import spock.lang.Specification

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Monday, 3/5/2018
 */
@SpringBootTest
public class SpringBootUtility2 extends Specification {

    @Test
    "Try running what do you know"() {
        expect:
            println "done"
    }

    @Configuration
    static class Config {
        @Bean
        CommandLineRunner commandLineRunner() {
            return { args ->
                println "what do you know 2"
            }
        }
    }
}
