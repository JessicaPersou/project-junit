package com.algaworks.junit.utilidade;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class SimuladorEsperaTest {
    @Test
//    @Disabled("Não é mais aplicável") essa desabilita totalmente o teste
//    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV") só executara se tiver no ambiente de DEV
    void deveEsperar(){
//        Essa anotação faz o teste rodar somente se tiver no ambiente que for PROD
        Assumptions.assumeTrue("PROD".equals(System.getenv("ENV")), () -> "Nâo deve ser executado em PRDO");
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
    }

}