package dev.rost.autoconfigurationpackagesandbox.pets;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
record Pet(@Id Integer id) {}
