package com.cydeo;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
public class Employee {

    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers;

}
