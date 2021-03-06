package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionFilterModel extends js.Object {
  /**
    * Flat list of clauses in this subscription
    */
  var clauses: js.Array[ExpressionFilterClause]
  /**
    * Grouping of clauses in the subscription
    */
  var groups: js.Array[ExpressionFilterGroup]
  /**
    * Max depth of the Subscription tree
    */
  var maxGroupLevel: scala.Double
}

object ExpressionFilterModel {
  @scala.inline
  def apply(
    clauses: js.Array[ExpressionFilterClause],
    groups: js.Array[ExpressionFilterGroup],
    maxGroupLevel: scala.Double
  ): ExpressionFilterModel = {
    val __obj = js.Dynamic.literal(clauses = clauses, groups = groups, maxGroupLevel = maxGroupLevel)
  
    __obj.asInstanceOf[ExpressionFilterModel]
  }
}

