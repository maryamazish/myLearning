package com.motaharinia.designpattern.creational.factorymethod;

import com.motaharinia.designpattern.creational.factorymethod.plan.*;

public class PlanFactory {
    //use getPlan method to get object of type Plan
    public Plan getPlan(PlanEnum planEnum) {
        if (planEnum == null) {
            return null;
        } else {
            switch (planEnum) {
                case COMMERCIAL_PLAN:
                    return new CommercialPlan();
                case DOMESTIC_PLAN:
                    return new DomesticPlan();
                case INSTITUTIONAL_PLAN:
                    return new InstitutionalPlan();
                default:
                    return null;
            }
        }
    }
}