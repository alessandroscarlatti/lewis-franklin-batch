package com.scarlatti;

import com.scarlatti.model.Penguin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Tuesday, 2/27/2018
 */
@Component
public class PenguinRetrievalService {

    private static final Logger log = LoggerFactory.getLogger(PenguinRetrievalService.class);

    public List<Penguin> getPenguins() {

        log.info("Retrieving penguins");

        return Arrays.asList(
            new Penguin("Annie", 3),
            new Penguin("Phil", 5),
            new Penguin("Charlotte", 2)
        );
    }
}
