package com.example.demo;

import com.example.demo.Model.Entity.*;
import com.example.demo.Model.Enum.ContractType;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner //to run code in application start up
{
    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    BusinessUnitRepository businessUnitRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    UnitRepository unitRepository;

    @Autowired
    EmployeeRepository employeeRepository;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //company
        Company unisystems = new Company("UniSystems");
        companyRepository.save(unisystems);


        //BussinesUnits
        BusinessUnit businessUnit1 = new BusinessUnit("businessunit1");
        BusinessUnit businessUnit2 = new BusinessUnit("businessunit2");


        businessUnit1.setCompany(unisystems);
        businessUnit2.setCompany(unisystems);
        businessUnitRepository.save(businessUnit1);
        businessUnitRepository.save(businessUnit2);


        //Departments
        Department production = new Department("Production");
        Department marketing = new Department("Marketing");
        Department technical = new Department("Technical");
        Department humanResources = new Department("Human Resources");


        production.setBusinessUnit(businessUnit1);
        marketing.setBusinessUnit(businessUnit1);
        technical.setBusinessUnit(businessUnit2);
        humanResources.setBusinessUnit(businessUnit2);

        departmentRepository.save(production);
        departmentRepository.save(marketing);
        departmentRepository.save(technical);
        departmentRepository.save(humanResources);

        //units
        Unit qamanage = new Unit("QA Manage");
        Unit productionPlanning = new Unit("Production Planning");
        Unit promotionsMedia = new Unit("Promotions / Media");
        Unit publicRelations = new Unit("Public Relations");
        Unit productDesign = new Unit("Product Design");
        Unit technicalService = new Unit("Technical Service");
        Unit trainingGroup = new Unit("Training Group");
        Unit recruitingTeam = new Unit("Recruiting Team");


        qamanage.setDepartment(production);
        productionPlanning.setDepartment(production);
        promotionsMedia.setDepartment(marketing);
        publicRelations.setDepartment(marketing);
        productDesign.setDepartment(technical);
        technicalService.setDepartment(technical);
        trainingGroup.setDepartment(humanResources);
        recruitingTeam.setDepartment(humanResources);

        unitRepository.save(qamanage);
        unitRepository.save(productionPlanning);
        unitRepository.save(promotionsMedia);
        unitRepository.save(publicRelations);
        unitRepository.save(productDesign);
        unitRepository.save(technicalService);
        unitRepository.save(trainingGroup);
        unitRepository.save(recruitingTeam);


        //employees
        Employee giorgosPort = new Employee("Πορτοκαλλάς", "Γεώργιος", "Υμήττου 4", "6514754", "2019-02-10", "2019-04-30", "Controls Engineer", true, ContractType.UniSystems);
        Employee katerinaPap = new Employee("Παπαδοπούλου", "Κατερίνα", "Σκρα 10", "6060112", "2010-03-20", "2019-12-05", "Senior Analyst", false, ContractType.External);
        Employee kwstasPet = new Employee("Πετρόπουλος", "Κώστας", "Σαρανταπόρου 10", "6422192", "2012-02-12", "2015-12-05", "Junior Developer", true, ContractType.UniSystems);
        Employee adonisKalak = new Employee("Καλακώνας", "Αντώνιος", "Ριγα Φεραιου 5", "8966555", "2013-05-09", "2014-07-19", "Account", true, ContractType.UniSystems);
        Employee giannisVas = new Employee("Βασιλόπουλος", "Γιάννης", "Περικλέους 8", "7754754", "2012-02-11", "2018-08-14", "Account", false, ContractType.External);
        Employee kseniaKont = new Employee("Κοντογιώργη", "Ξένια", "Αετιδέων 2", "6584555", "2018-10-01", "2019-09-30", "customer Service", true, ContractType.UniSystems);
        Employee polinaEva = new Employee("Ευαγγέλου", "Πώλινα", "Μιχαλακοπούλου 144", "9888545", "2016-05-08", "2019-02-14", "trainner", false, ContractType.External);
        Employee iordanisDim = new Employee("Διμάκης", "Ιορδάνης", "Κεφαλινίας 14", "6505557", "2017-05-14", "2018-06-20", "recruiting Team manager", false, ContractType.External);


        //employeeRepository.save(asdf);
        //    public Employee(long id, String lastName, String name, String address, String phoneNumber, Date hireDate, Date departureDate, String position, Status status, ContractType contractType) {

        katerinaPap.setUnit(qamanage);
        giorgosPort.setUnit(productionPlanning);
        kwstasPet.setUnit(promotionsMedia);
        adonisKalak.setUnit(publicRelations);
        giannisVas.setUnit(productDesign);
        kseniaKont.setUnit(technicalService);
        polinaEva.setUnit(trainingGroup);
        iordanisDim.setUnit(recruitingTeam);
        //asdf.setUnit(qamanage);


        employeeRepository.save(giorgosPort);
        employeeRepository.save(katerinaPap);
        employeeRepository.save(kwstasPet);
        employeeRepository.save(adonisKalak);
        employeeRepository.save(giannisVas);
        employeeRepository.save(kseniaKont);
        employeeRepository.save(polinaEva);
        employeeRepository.save(iordanisDim);


    }



}
