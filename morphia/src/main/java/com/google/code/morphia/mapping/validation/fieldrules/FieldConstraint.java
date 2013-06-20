package com.google.code.morphia.mapping.validation.fieldrules;


import java.util.Set;

import com.google.code.morphia.mapping.MappedClass;
import com.google.code.morphia.mapping.MappedField;
import com.google.code.morphia.mapping.Mapper;
import com.google.code.morphia.mapping.validation.ClassConstraint;
import com.google.code.morphia.mapping.validation.ConstraintViolation;


/**
 * @author Uwe Schaefer, (us@thomas-daily.de)
 */
public abstract class FieldConstraint implements ClassConstraint {
  Mapper mapper;

  public final void check(final MappedClass mc, final Set<ConstraintViolation> ve) {
    for (final MappedField mf : mc.getPersistenceFields()) {
      check(mc, mf, ve);
    }
  }

  protected abstract void check(MappedClass mc, MappedField mf, Set<ConstraintViolation> ve);

}
