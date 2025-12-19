import java.util.*;
class CountryNotValidException extends Exception {
    public String getMessage() {
        return "The employee should be an Indian citizen for calculating tax";
    }
}
class TaxNotEligibleException extends Exception {
    public String getMessage() {
        return "The employee does not need to pay tax";
    }
}
class EmployeeNameInvalidException extends Exception {
    public String getMessage() {
        return "The employee name cannot be empty";
    }
}
class TaxCalculator {
    double calculateTax(String empName, boolean isIndian, double empSal)
    throws CountryNotValidException, TaxNotEligibleException, EmployeeNameInvalidException {
        double taxAmount = 0;
        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException();
        }
        if (!isIndian) {
            throw new CountryNotValidException();
        }
        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal > 50000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal > 10000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException();
        }
        return taxAmount;
    }
}
public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();
        try {
            double tax = tc.calculateTax("Tejaswini", true, 30000);
            System.out.println("The tax amount is: " + tax);
        }
        catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        }
        catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        }
        catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
