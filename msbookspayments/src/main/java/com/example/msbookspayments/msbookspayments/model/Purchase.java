package com.example.msbookspayments.msbookspayments.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "purchases")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookTitle;

    public Purchase(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
