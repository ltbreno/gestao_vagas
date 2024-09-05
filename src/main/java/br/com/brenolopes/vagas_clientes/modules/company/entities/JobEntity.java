package br.com.brenolopes.vagas_clientes.modules.company.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.UUID;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "job")
@Data
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    private String benefits;
    private String level;

    private UUID companyId;

    @CreationTimestamp
    private LocalDateTime createdAt;
    
}
