package ru.transport;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
record Car(@Id Integer id) {}
