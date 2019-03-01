package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlanCloneRequest extends js.Object {
  var destinationTestPlan: TestPlan
  var options: CloneOptions
  var suiteIds: js.Array[scala.Double]
}

object TestPlanCloneRequest {
  @scala.inline
  def apply(destinationTestPlan: TestPlan, options: CloneOptions, suiteIds: js.Array[scala.Double]): TestPlanCloneRequest = {
    val __obj = js.Dynamic.literal(destinationTestPlan = destinationTestPlan, options = options, suiteIds = suiteIds)
  
    __obj.asInstanceOf[TestPlanCloneRequest]
  }
}

