package com.marcelofidelis.mercedes_project.servicestests.department;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;
import com.marcelofidelis.mercedes_project.repositories.DepartmentRepository;
import com.marcelofidelis.mercedes_project.services.DepartmentServiceImpl;

@DataJpaTest
@ContextConfiguration(classes = DepartmentServiceImplTestCC.class)
public class DepartmentServiceImplIntTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentServiceImpl departmentServiceImpl;

    @Test
    public void getDepartmentId_ShouldReturnTheId() {
        DtoDepartment dto = new DtoDepartment("Almoxarifado", "Essa é uma descrição de teste");
        var test = departmentServiceImpl.createDepartment(dto);
        Assertions.assertEquals(1, test.getId());

    }
}
