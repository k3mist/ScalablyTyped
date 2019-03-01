package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultTrendFilter extends js.Object {
  var branchNames: js.Array[java.lang.String]
  var buildCount: scala.Double
  var definitionIds: js.Array[scala.Double]
  var envDefinitionIds: js.Array[scala.Double]
  var maxCompleteDate: stdLib.Date
  var publishContext: java.lang.String
  var testRunTitles: js.Array[java.lang.String]
  var trendDays: scala.Double
}

object TestResultTrendFilter {
  @scala.inline
  def apply(
    branchNames: js.Array[java.lang.String],
    buildCount: scala.Double,
    definitionIds: js.Array[scala.Double],
    envDefinitionIds: js.Array[scala.Double],
    maxCompleteDate: stdLib.Date,
    publishContext: java.lang.String,
    testRunTitles: js.Array[java.lang.String],
    trendDays: scala.Double
  ): TestResultTrendFilter = {
    val __obj = js.Dynamic.literal(branchNames = branchNames, buildCount = buildCount, definitionIds = definitionIds, envDefinitionIds = envDefinitionIds, maxCompleteDate = maxCompleteDate, publishContext = publishContext, testRunTitles = testRunTitles, trendDays = trendDays)
  
    __obj.asInstanceOf[TestResultTrendFilter]
  }
}

