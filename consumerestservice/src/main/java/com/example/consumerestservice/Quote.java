package com.example.consumerestservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record Quote(String type, Value value) {
}
