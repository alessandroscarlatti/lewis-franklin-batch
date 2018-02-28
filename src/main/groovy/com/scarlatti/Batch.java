package com.scarlatti;

import com.scarlatti.model.Penguin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Tuesday, 2/27/2018
 */
@Component
public class Batch implements CommandLineRunner {

    private Airport airport;
    private TrainStation trainStation;
    private PenguinRetrievalService penguinRetrievalService;

    public Batch(Airport airport, TrainStation trainStation, PenguinRetrievalService penguinRetrievalService) {
        this.airport = airport;
        this.trainStation = trainStation;
        this.penguinRetrievalService = penguinRetrievalService;
    }

    private final static Logger log = LoggerFactory.getLogger(App.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("Gather the penguins and then either transport them by train station or airport");

        List<Penguin> penguins = penguinRetrievalService.getPenguins();

        for (Penguin penguin : penguins) {
            if (airport.allowsTraveler(penguin)) {
                airport.transport(penguin);
            } else if (trainStation.allowsTraveler(penguin)) {
                trainStation.transport(penguin);
            } else {
                log.info("Penguin not allowed to travel: {}", penguin);
//                throw new IllegalStateException("Not allowed to travel.");
            }
        }
    }
}
