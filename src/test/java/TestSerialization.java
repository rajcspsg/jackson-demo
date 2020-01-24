import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;

public class TestSerialization {

  @Test
  public void testNullObjectSerialization() throws Exception {

    ObjectMapper mapper = new ObjectMapper();
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);

    ByteArrayOutputStream out = new ByteArrayOutputStream(1000);
    mapper.writeValue(out, new Ext.ExtBuilder().withAdditionalProperty("unexpected", null).withAdditionalProperty("expected", true).build());
    String result = new String(out.toByteArray());
    Assert.assertEquals("{\"expected\":true}", result);
  }

}
