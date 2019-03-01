package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOffset extends ZoneId {
  def adjustInto(temporal: Temporal): Temporal
  def compareTo(other: ZoneOffset): scala.Double
  def get(field: TemporalField): scala.Double
  def getLong(field: TemporalField): scala.Double
  def id(): java.lang.String
  def query(query: TemporalQuery): js.Any
  def totalSeconds(): scala.Double
}

object ZoneOffset {
  @scala.inline
  def apply(
    adjustInto: js.Function1[Temporal, Temporal],
    compareTo: js.Function1[ZoneOffset, scala.Double],
    equals: js.Function1[js.Any, scala.Boolean],
    get: js.Function1[TemporalField, scala.Double],
    getLong: js.Function1[TemporalField, scala.Double],
    hashCode: js.Function0[scala.Double],
    id: js.Function0[java.lang.String],
    normalized: js.Function0[ZoneId],
    query: js.Function1[TemporalQuery, js.Any],
    rules: js.Function0[ZoneRules],
    toString: js.Function0[java.lang.String],
    totalSeconds: js.Function0[scala.Double]
  ): ZoneOffset = {
    val __obj = js.Dynamic.literal(adjustInto = adjustInto, compareTo = compareTo, equals = equals, get = get, getLong = getLong, hashCode = hashCode, id = id, normalized = normalized, query = query, rules = rules, toString = toString, totalSeconds = totalSeconds)
  
    __obj.asInstanceOf[ZoneOffset]
  }
}

