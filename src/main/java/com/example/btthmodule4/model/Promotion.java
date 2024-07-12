package com.example.btthmodule4.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Vui lòng không để trống")
    private String title;
    @Future(message = "Vui lòng chọn ngày trong tương lai")
    @NotNull(message = "Vui lòng không để trống")
    private LocalDate startDate;
    @Future(message = "Vui lòng chọn ngày trong tương lai")
    @NotNull(message = "Vui lòng không để trống")
    private LocalDate endDate;
    @NotNull(message = "Vui lòng không để trống")
    @Min(value = 50000,message = "Mức thấp nhất dưới là 50000VNĐ")
    private Double discount;
    @NotEmpty(message = "Vui lòng không để trống")
    private String description;
}
