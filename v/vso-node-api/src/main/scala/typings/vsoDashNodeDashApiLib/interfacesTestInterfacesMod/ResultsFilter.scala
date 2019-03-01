package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsFilter extends js.Object {
  var automatedTestName: java.lang.String
  var branch: java.lang.String
  var groupBy: java.lang.String
  var maxCompleteDate: stdLib.Date
  var resultsCount: scala.Double
  var testCaseReferenceIds: js.Array[scala.Double]
  var testResultsContext: TestResultsContext
  var trendDays: scala.Double
}

object ResultsFilter {
  @scala.inline
  def apply(
    automatedTestName: java.lang.String,
    branch: java.lang.String,
    groupBy: java.lang.String,
    maxCompleteDate: stdLib.Date,
    resultsCount: scala.Double,
    testCaseReferenceIds: js.Array[scala.Double],
    testResultsContext: TestResultsContext,
    trendDays: scala.Double
  ): ResultsFilter = {
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName, branch = branch, groupBy = groupBy, maxCompleteDate = maxCompleteDate, resultsCount = resultsCount, testCaseReferenceIds = testCaseReferenceIds, testResultsContext = testResultsContext, trendDays = trendDays)
  
    __obj.asInstanceOf[ResultsFilter]
  }
}

