import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.harlequinnoeccoral.ismHarlequinNOECCoral;
import model.ModelExecutionTest;

public class HarlequinNOECCoralTest extends ModelExecutionTest  {
    @Override
    protected InsilicoModel getModel() throws InitFailureException {
        return new ismHarlequinNOECCoral();
    }
}
