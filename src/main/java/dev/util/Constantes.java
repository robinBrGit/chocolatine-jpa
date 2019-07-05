package dev.util;

import dev.service.ChocolatineService;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface Constantes {
    ChocolatineService CHOCOLATINE_SERVICE = new ChocolatineService();
    EntityManagerFactory EMF = Persistence.createEntityManagerFactory("demo-jpa");
}
