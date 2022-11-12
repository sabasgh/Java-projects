public class GetPlanFactory {

    // to generate object of concrete classes based on given information
    // use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equals("domesticPlan")) {
            return new DomesticPlan();
        }
        if (planType.equals("specialPlan")) {
            return new SpecialPlan();
        }
        if (planType.equals("commercialPlan")) {
            return new CommercialPlan();
        }
        return null;
    }
}
