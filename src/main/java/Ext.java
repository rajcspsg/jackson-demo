
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({})
public class Ext implements Serializable {

  @JsonIgnore
  @JsonInclude(Include.NON_NULL)
  private Map<String, Object> additionalProperties = new HashMap();
  private static final long serialVersionUID = -4500317258794294335L;

  public Ext() {
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  public boolean equals(Object other) {
    if (other == this) {
      return true;
    } else if (!(other instanceof Ext)) {
      return false;
    } else {
      Ext rhs = (Ext)other;
      return Objects.equals(this.additionalProperties, rhs.additionalProperties);
    }
  }

  public static class ExtBuilder {
    protected Ext instance;

    public ExtBuilder() {
      if (this.getClass().equals(Ext.ExtBuilder.class)) {
        this.instance = new Ext();
      }
    }

    public Ext build() {
      Ext result = this.instance;
      this.instance = null;
      return result;
    }

    public Ext.ExtBuilder withAdditionalProperty(String name, Object value) {
      this.instance.getAdditionalProperties().put(name, value);
      return this;
    }
  }
}
