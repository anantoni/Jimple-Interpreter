package de.upb.soot.jimple.interpreter;

import de.upb.soot.jimple.interpreter.values.JObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Manuel Benz created on 29.06.18
 */
public class Environment {

  private final Map<IValue, IValue> idToValue = new HashMap<>();
  private final JObject thisInstance;

  public Environment() {
    this(null);
  }

  public Environment(JObject thisInstance) {
    this.thisInstance = thisInstance;
  }

  public IValue getLocal(IValue id) {
    final IValue iValue = idToValue.get(id);

    if (iValue != null) {
      return iValue;
    } else {
      throw new IllegalArgumentException("Given local does not exist in scope: " + id);
    }
  }

  public void putLocal(IValue id, IValue value) {
    idToValue.put(id, value);
  }

  public JObject getThisInstance() {
    return thisInstance;
  }
}