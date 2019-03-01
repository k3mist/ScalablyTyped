package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedGroup...
  */
trait INxDerivedGroup extends js.Object {
  /**
    * List of the derived fields in the group.
    */
  var qFieldDefs: js.Array[java.lang.String]
  /**
    * Grouping type.
    * The grouping should be either H or C (Grouping is mandatory for derived definitions).
    * >> Is mandatory.
    */
  var qGrouping: NxGrpType
  /**
    * Identifier of the group.
    */
  var qId: java.lang.String
  /**
    * Name of the derived group.
    */
  var qName: java.lang.String
}

object INxDerivedGroup {
  @scala.inline
  def apply(
    qFieldDefs: js.Array[java.lang.String],
    qGrouping: NxGrpType,
    qId: java.lang.String,
    qName: java.lang.String
  ): INxDerivedGroup = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs, qGrouping = qGrouping.asInstanceOf[js.Any], qId = qId, qName = qName)
  
    __obj.asInstanceOf[INxDerivedGroup]
  }
}

