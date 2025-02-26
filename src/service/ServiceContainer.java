package service;

import repository.calculation.CalculationFormulaListImpl;
import repository.customer.CustomerListImpl;
import repository.employee.EmployeeListImpl;
import repository.insurance.InsuranceListImpl;

import java.rmi.RemoteException;

public class ServiceContainer {
    private final LoginServiceIF loginService;
    private final MakeInsuranceServiceIF makeInsuranceService;
    private final MakeFormulaServiceIF makeFormulaService;
    private final AuthorizeServiceIF AuthorizeService;

    public ServiceContainer() throws RemoteException {
        CalculationFormulaListImpl calculationFormulaList = new CalculationFormulaListImpl();
        InsuranceListImpl insuranceList = new InsuranceListImpl();
        EmployeeListImpl employeeList = new EmployeeListImpl();
        CustomerListImpl customerList = new CustomerListImpl();

        loginService = new LoginService(customerList, employeeList);
        makeInsuranceService = new MakeInsuranceService(calculationFormulaList, insuranceList);
        makeFormulaService = new MakeFormulaService(calculationFormulaList);
        AuthorizeService = new AuthorizeService(insuranceList, calculationFormulaList);

//        RMI로 분리할 때 위에거 지우고 아래거 쓸 것.
//        loginService = (LoginServiceIF) Naming.lookup("loginService");
//        makeInsuranceService = (MakeInsuranceServiceIF) Naming.lookup("makeInsuranceService");
//        makeFormulaService = (MakeFormulaServiceIF) Naming.lookup("makeFormulaService");
//        examineInsuranceService = (ExamineInsuranceServiceIF) Naming.lookup("examineInsuranceService");
    }

    public LoginServiceIF getLoginService() {
        return loginService;
    }

    public MakeInsuranceServiceIF getMakeInsuranceService() {
        return makeInsuranceService;
    }

    public MakeFormulaServiceIF getMakeFormulaService() {
        return makeFormulaService;
    }

    public AuthorizeServiceIF getAuthorizeService() {
        return AuthorizeService;
    }
}
