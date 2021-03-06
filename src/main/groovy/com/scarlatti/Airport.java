package com.scarlatti;

import com.scarlatti.model.AllowsTraveler;
import com.scarlatti.model.Penguin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Tuesday, 2/27/2018
 */
@Component
public class Airport implements AllowsTraveler {

    private static final Logger log = LoggerFactory.getLogger(Airport.class);

    public void transport(Penguin penguin) {
        log.info("Flying penguin {}", penguin);
    }

    /**
     * Allow travelers 5 and older
     * @param penguin traveler to evaluate
     * @return whether or not allowed to travel
     */
    @Override
    public boolean allowsTraveler(Penguin penguin) {
        return penguin.getAge() >= 5;
    }
}
