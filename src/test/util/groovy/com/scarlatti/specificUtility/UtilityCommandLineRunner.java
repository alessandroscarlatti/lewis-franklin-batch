package com.scarlatti.specificUtility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Monday, 3/5/2018
 */
public class UtilityCommandLineRunner {

    @Component
    public static class Runner implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            System.out.println("Running the SpecificUtility Command Line Runner");
        }
    }

}
