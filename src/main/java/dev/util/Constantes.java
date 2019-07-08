package dev.util;

import dev.service.ChocolatineService;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface Constantes {
    EntityManagerFactory EMF = Persistence.createEntityManagerFactory("demo-jpa");
    ChocolatineService CHOCOLATINE_SERVICE = new ChocolatineService();
}
