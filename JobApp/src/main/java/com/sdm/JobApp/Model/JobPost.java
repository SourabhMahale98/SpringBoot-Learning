package com.sdm.JobApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private  String jobTitle;
    private  String companyName;
    private  String jobDescription;
    private  String location;

}
