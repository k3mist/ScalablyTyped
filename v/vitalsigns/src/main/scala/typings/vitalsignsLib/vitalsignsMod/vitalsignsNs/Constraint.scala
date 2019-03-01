package typings
package vitalsignsLib.vitalsignsMod.vitalsignsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  /**
    * The comparator to use when comparing the field's value with the constraint value.
    * Valid comparators are: 'equal', 'greater', and 'less'.
    * @type {string}
    */
  var comparator: java.lang.String
  /**
    * The name of the field to be constrained.
    * @type {string}
    */
  var field: java.lang.String
  /**
    * The name of the monitor containing the field to be constrained.
    * @type {string}
    */
  var monitor: java.lang.String
  /**
    * true to negate the outcome of the comparison; false or omitted to use the comparison result.
    * @type {boolean}
    */
  var negate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The value against which the field should be compared.
    * @type {any}
    */
  var value: js.Any
}

object Constraint {
  @scala.inline
  def apply(
    comparator: java.lang.String,
    field: java.lang.String,
    monitor: java.lang.String,
    value: js.Any,
    negate: js.UndefOr[scala.Boolean] = js.undefined
  ): Constraint = {
    val __obj = js.Dynamic.literal(comparator = comparator, field = field, monitor = monitor, value = value)
    if (!js.isUndefined(negate)) __obj.updateDynamic("negate")(negate)
    __obj.asInstanceOf[Constraint]
  }
}

