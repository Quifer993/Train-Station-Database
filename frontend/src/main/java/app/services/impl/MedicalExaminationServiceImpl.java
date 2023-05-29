package app.services.impl;

import app.model.MedicalExamination;
import app.model.StatusTrains;
import app.services.MedicalExaminationService;
import app.services.StatusTrainsService;
import app.services.impl.api.MedicalExaminationServiceApi;
import app.services.impl.api.StatusTrainsServiceApi;

public class MedicalExaminationServiceImpl
        extends AbstractCrudServiceImpl<MedicalExamination>
        implements MedicalExaminationService {

    public MedicalExaminationServiceImpl(String baseUrl) {
        super(MedicalExaminationServiceApi.class, MedicalExamination.class, baseUrl, "medical");
    }
}
