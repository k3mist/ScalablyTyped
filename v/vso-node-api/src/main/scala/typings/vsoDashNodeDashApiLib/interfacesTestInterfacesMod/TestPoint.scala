package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPoint extends js.Object {
  var assignedTo: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var automated: scala.Boolean
  var comment: java.lang.String
  var configuration: ShallowReference
  var failureType: java.lang.String
  var id: scala.Double
  var lastResolutionStateId: scala.Double
  var lastResult: ShallowReference
  var lastResultDetails: LastResultDetails
  var lastResultState: java.lang.String
  var lastRunBuildNumber: java.lang.String
  var lastTestRun: ShallowReference
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastUpdatedDate: stdLib.Date
  var outcome: java.lang.String
  var revision: scala.Double
  var state: java.lang.String
  var suite: ShallowReference
  var testCase: WorkItemReference
  var testPlan: ShallowReference
  var url: java.lang.String
  var workItemProperties: js.Array[_]
}

object TestPoint {
  @scala.inline
  def apply(
    assignedTo: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    automated: scala.Boolean,
    comment: java.lang.String,
    configuration: ShallowReference,
    failureType: java.lang.String,
    id: scala.Double,
    lastResolutionStateId: scala.Double,
    lastResult: ShallowReference,
    lastResultDetails: LastResultDetails,
    lastResultState: java.lang.String,
    lastRunBuildNumber: java.lang.String,
    lastTestRun: ShallowReference,
    lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastUpdatedDate: stdLib.Date,
    outcome: java.lang.String,
    revision: scala.Double,
    state: java.lang.String,
    suite: ShallowReference,
    testCase: WorkItemReference,
    testPlan: ShallowReference,
    url: java.lang.String,
    workItemProperties: js.Array[_]
  ): TestPoint = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, automated = automated, comment = comment, configuration = configuration, failureType = failureType, id = id, lastResolutionStateId = lastResolutionStateId, lastResult = lastResult, lastResultDetails = lastResultDetails, lastResultState = lastResultState, lastRunBuildNumber = lastRunBuildNumber, lastTestRun = lastTestRun, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, outcome = outcome, revision = revision, state = state, suite = suite, testCase = testCase, testPlan = testPlan, url = url, workItemProperties = workItemProperties)
  
    __obj.asInstanceOf[TestPoint]
  }
}

