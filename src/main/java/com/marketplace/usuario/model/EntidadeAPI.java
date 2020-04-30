package com.marketplace.usuario.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntidadeAPI implements Serializable {
}
