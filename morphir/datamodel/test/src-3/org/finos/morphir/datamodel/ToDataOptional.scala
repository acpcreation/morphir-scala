package org.finos.morphir.datamodel

import org.finos.morphir.datamodel.Deriver

import scala.collection.immutable.ListMap
import scala.collection.mutable.LinkedHashMap

class ToDataOptional extends munit.FunSuite {
  test("Option") {
    assertEquals(
      Deriver.toData(Option(123)),
      Data.Optional.Some(Data.Int(123))
    )
  }
  test("Option Some") {
    assertEquals(
      Deriver.toData(Some(123)),
      Data.Optional.Some(Data.Int(123))
    )
  }
  test("Option None") {
    assertEquals(
      Deriver.toData(None),
      Data.Optional.None(Concept.Nothing)
    )
  }
}