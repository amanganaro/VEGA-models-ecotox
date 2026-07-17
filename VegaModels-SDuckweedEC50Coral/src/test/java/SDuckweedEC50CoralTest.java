import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.sduckweedec50coral.ismSDuckweedEC50Coral;
import model.ModelExecutionTest;

public class SDuckweedEC50CoralTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException {
        return new ismSDuckweedEC50Coral();
    }
}
