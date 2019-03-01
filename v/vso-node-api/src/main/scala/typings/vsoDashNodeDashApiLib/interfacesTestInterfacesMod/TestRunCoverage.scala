package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunCoverage extends js.Object {
  var lastError: java.lang.String
  var modules: js.Array[ModuleCoverage]
  var state: java.lang.String
  var testRun: ShallowReference
}

object TestRunCoverage {
  @scala.inline
  def apply(
    lastError: java.lang.String,
    modules: js.Array[ModuleCoverage],
    state: java.lang.String,
    testRun: ShallowReference
  ): TestRunCoverage = {
    val __obj = js.Dynamic.literal(lastError = lastError, modules = modules, state = state, testRun = testRun)
  
    __obj.asInstanceOf[TestRunCoverage]
  }
}

