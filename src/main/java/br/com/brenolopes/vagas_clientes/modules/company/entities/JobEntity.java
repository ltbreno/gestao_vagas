package br.com.brenolopes.vagas_clientes.modules.company.entities;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "job")
@Data
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;
    private String benefits;
    private String level;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false) 
    private CompanyEntity companyEntity;

    @Column(name = "company_id", insertable = false, updatable = false)  
    private UUID companyId;

    @CreationTimestamp
    private LocalDateTime createdAt;
    
}
