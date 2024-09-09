package com.example.demo.dtos;

import com.example.demo.models.XepLoai;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Builder
public class StudentDto {
    @JsonProperty("name")
    @NotBlank(message = "Name cannot be blank")
    public String name;

    @JsonProperty("thanhpho")
    @NotBlank(message = "Thành phố không được để trống")
    public String thanhpho;

    @JsonProperty("ngaysinh")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message = "Ngày sinh phải lớn hơn hoặc bằng ngày hiện tại")
    public Date ngaysinh;

    @JsonProperty("xeploai")
    @NotNull(message = "Xep loai can not be null")
    private XepLoai xeploai;
}
