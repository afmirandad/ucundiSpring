package com.ucundi.spring.dataInitial;

import com.ucundi.spring.domain.*;
import com.ucundi.spring.repositories.camasRepositories;
import com.ucundi.spring.repositories.comidaRepositories;
import com.ucundi.spring.repositories.ropaRepositories;
import com.ucundi.spring.repositories.serviciosRepositories;
import com.ucundi.spring.repositories.juquetesRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class PetStrapData implements CommandLineRunner {

    private final camasRepositories CamasRepository;
    private final comidaRepositories ComidaRepository;
    private final juquetesRepositories JuguetesRepository;
    private final ropaRepositories RopaRepository;
    private final serviciosRepositories ServiciosRepository;

    public PetStrapData(camasRepositories camasRepository, comidaRepositories comidaRepository, juquetesRepositories juguetesRepository, ropaRepositories ropaRepository, serviciosRepositories serviciosRepository) {
        CamasRepository = camasRepository;
        ComidaRepository = comidaRepository;
        JuguetesRepository = juguetesRepository;
        RopaRepository = ropaRepository;
        ServiciosRepository = serviciosRepository;
    }

    @Override
    public void run(String... args) {

        camasEntity cama1 = new camasEntity("baseCama","primaveraAzul",230000);
        camasEntity cama2 = new camasEntity("queen","primaveraAzul",2300000);
        camasEntity cama3 = new camasEntity("king","primaveraAzul",2300000);
        comidaEntity comida1 = new comidaEntity("medicada","catshow","petHealth",123000);
        comidaEntity comida2 = new comidaEntity("normal","catshow","petHealth",223000);
        comidaEntity comida3 = new comidaEntity("adultos","dogshow","petHealth",103000);
        juguetesEntity juguete1 = new juguetesEntity("pelota","chineseCats",25000);
        ropaEntity ropa1 = new ropaEntity("buso","nikePets","M",45000);
        serviciosEntity servicio1 = new serviciosEntity("consulta","on-demand",150000);

        CamasRepository.save(cama1);
        CamasRepository.save(cama2);
        CamasRepository.save(cama3);
        ComidaRepository.save(comida1);
        ComidaRepository.save(comida2);
        ComidaRepository.save(comida3);
        JuguetesRepository.save(juguete1);
        RopaRepository.save(ropa1);
        ServiciosRepository.save(servicio1);

        System.out.println("Prueba de concepto");
        System.out.println("Cantidad de camas: "+CamasRepository.count());
    }
}
