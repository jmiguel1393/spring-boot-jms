package biz.belcorp.spring.springboot.jms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Portfolio {
    private LocalDate starDate;
    private LocalDate endDate;
    private String providerId;
}
