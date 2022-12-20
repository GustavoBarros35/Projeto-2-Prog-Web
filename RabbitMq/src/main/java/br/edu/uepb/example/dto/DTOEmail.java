package br.edu.uepb.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOEmail {
    private String emailTo;
    private String subject;
    private String text;
}