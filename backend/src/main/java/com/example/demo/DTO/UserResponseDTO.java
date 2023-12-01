package com.example.demo.DTO;

import com.example.demo.domain.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonPropertyOrder({ "page", "per_page", "total", "total_pages", "data", "support"})
public class UserResponseDTO {
    private int page;
    @JsonProperty("per_page")
    private int perPage;
    private int total;
    @JsonProperty("total_pages")
    private int totalPages;
    private List<User> data;
    private SupportDTO support;
}
