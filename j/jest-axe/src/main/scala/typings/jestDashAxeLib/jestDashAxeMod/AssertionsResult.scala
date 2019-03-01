package typings
package jestDashAxeLib.jestDashAxeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionsResult extends js.Object {
  /**
    * Actual checked aXe verification results.
    */
  var actual: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result]
  /**
    * Whether the assertion passed.
    */
  var pass: scala.Boolean
  /**
    * @returns Message from the Jest assertion.
    */
  def message(): java.lang.String
}

object AssertionsResult {
  @scala.inline
  def apply(
    actual: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result],
    message: js.Function0[java.lang.String],
    pass: scala.Boolean
  ): AssertionsResult = {
    val __obj = js.Dynamic.literal(actual = actual, message = message, pass = pass)
  
    __obj.asInstanceOf[AssertionsResult]
  }
}

