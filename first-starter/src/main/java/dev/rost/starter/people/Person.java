package dev.rost.starter.people;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Person(@Id Integer id) {}
