package com.univesp.inventory.control.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "stock_movements")
public class StockMovementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ProductEntity product;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private MovementType type; // ENTRY, EXIT, TRANSFER

    private LocalDateTime date;
    private String reason;
}