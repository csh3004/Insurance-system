package domain.calculationFormula;


import enumeration.calculationFormula.OutwallType;
import enumeration.calculationFormula.PillarType;
import enumeration.calculationFormula.RiskLevel;
import enumeration.calculationFormula.RoofType;
import enumeration.calculationFormula.workplaceFormula.Floor;
import enumeration.calculationFormula.workplaceFormula.WorkplaceCompensation;
import enumeration.calculationFormula.workplaceFormula.WorkplaceSquareMeter;
import enumeration.calculationFormula.workplaceFormula.WorkplaceUsage;

import java.util.HashMap;


public class WorkplaceFormula extends CalculationFormula {

	private HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage;
	private HashMap<Floor, RiskLevel> riskLevelAccordingToNumOfFloors;
	private HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareFeet;
	private HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation;
	
	public WorkplaceFormula(String calculationFormulaName, HashMap<PillarType, RiskLevel> riskLevelAccordingToPillarType,
			HashMap<RoofType, RiskLevel> riskLevelAccordingToRoofType,
			HashMap<OutwallType, RiskLevel> riskLevelAccordingToOutwallType, int numToMultiplyForMinCompensation,
			int numToMultiplyForMaxCompensation, int numToMultiplyForPayment,
			HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage,
			HashMap<Floor, RiskLevel> riskLevelAccordingToNumOfFloors,
			HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareFeet,
			HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation) {
		super(calculationFormulaName, riskLevelAccordingToPillarType, riskLevelAccordingToRoofType,
				riskLevelAccordingToOutwallType, numToMultiplyForMinCompensation, numToMultiplyForMaxCompensation,
				numToMultiplyForPayment);
		this.riskLevelAccordingToUsage = riskLevelAccordingToUsage;
		this.riskLevelAccordingToNumOfFloors = riskLevelAccordingToNumOfFloors;
		this.riskLevelAccordingToSquareFeet = riskLevelAccordingToSquareFeet;
		this.riskLevelAccordingToCompensation = riskLevelAccordingToCompensation;
	}

	public HashMap<WorkplaceUsage, RiskLevel> getRiskLevelAccordingToUsage() {
		return riskLevelAccordingToUsage;
	}

	public void setRiskLevelAccordingToUsage(HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage) {
		this.riskLevelAccordingToUsage = riskLevelAccordingToUsage;
	}

	public HashMap<Floor, RiskLevel> getRiskLevelAccordingToNumOfFloors() {
		return riskLevelAccordingToNumOfFloors;
	}

	public void setRiskLevelAccordingToNumOfFloors(HashMap<Floor, RiskLevel> riskLevelAccordingToNumOfFloors) {
		this.riskLevelAccordingToNumOfFloors = riskLevelAccordingToNumOfFloors;
	}

	public HashMap<WorkplaceSquareMeter, RiskLevel> getRiskLevelAccordingToSquareFeet() {
		return riskLevelAccordingToSquareFeet;
	}

	public void setRiskLevelAccordingToSquareFeet(HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareFeet) {
		this.riskLevelAccordingToSquareFeet = riskLevelAccordingToSquareFeet;
	}

	public HashMap<WorkplaceCompensation, RiskLevel> getRiskLevelAccordingToCompensation() {
		return riskLevelAccordingToCompensation;
	}

	public void setRiskLevelAccordingToCompensation(
			HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation) {
		this.riskLevelAccordingToCompensation = riskLevelAccordingToCompensation;
	}

}